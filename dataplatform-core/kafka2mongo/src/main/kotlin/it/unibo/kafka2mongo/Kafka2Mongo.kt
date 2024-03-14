@file:JvmName("Kafka2Mongo")

package it.unibo.kafka2mongo

import com.mongodb.client.MongoClients
import io.github.cdimascio.dotenv.Dotenv
import it.unibo.DOMAIN
import it.unibo.IMAGE_URL
import it.unibo.TIMESTAMP_KAFKA
import org.apache.kafka.clients.consumer.Consumer
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer
import org.bson.Document
import org.json.JSONObject
import java.time.Duration
import java.util.*
import java.util.concurrent.Executors
import java.util.regex.Pattern
import it.unibo.AREA_SERVED
import java.net.URL
import java.text.SimpleDateFormat

// NB: comments from the dotenv file will be loaded as strings as well! Be careful!
val dotenv: Dotenv = Dotenv.configure().directory("./.env").load()
const val GIVE_UP = 30

/**
 * Return the extension if known
 * E.g., it should return no extension for URLs like http://81.60.229.210:12356/snapshot?topic%3D/front_camera_rgb
 */
fun getExt(curUrl: String): String {
    val knownExts = listOf("jpg", "png", "tif", "svg", "gif")
    val ext = curUrl.substring(curUrl.lastIndexOf(".") + 1)
    return if (knownExts.contains(ext)) ".$ext" else ""
}

fun ftpImageName(obj: JSONObject, attr: String, ext: String): String {
    val id = obj.getString("id")
    val domain = if (obj.has(DOMAIN)) obj.getString(DOMAIN) else obj.getString(AREA_SERVED)
    val date = Date(System.currentTimeMillis())
    val jdf = SimpleDateFormat("yyyy-MM-dd")
    val jdf2 = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSSZ")
    return "${domain}/${id}/" + jdf.format(date) + "/" + jdf2.format(date) + "_" + id + "_" + attr + ext
}

fun consumeFromKafka(group: String, consume: (JSONObject) -> Unit) {
    // configuring the kafka client
    val props = Properties()
    props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = "${dotenv["KAFKA_IP"]}:${dotenv["KAFKA_PORT_EXT"]}"
    props[ConsumerConfig.GROUP_ID_CONFIG] = group
    props[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java.name
    props[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java.name
    props[ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG] = "true"
    props[ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG] = "1000"
    props[ConsumerConfig.AUTO_OFFSET_RESET_CONFIG] = "earliest"
    props[ConsumerConfig.METADATA_MAX_AGE_CONFIG] = "1000"
    // create the kafka consumer
    val consumer: Consumer<Long, String> = KafkaConsumer(props)
    // listen to all topics beginning with the RAW_TOPIC
    val pattern: Pattern = Pattern.compile("^${dotenv["RAW_TOPIC"]}.*")
    consumer.subscribe(pattern)
    var messageReceived = false
    var retry = 0
    while (true) {
        // consume the messages
        val consumerRecords = consumer.poll(Duration.ofMillis(1000))
        // if no message is received...
        if (!messageReceived && consumerRecords.count() == 0) {
            println("No message found: $retry")
            // increase the number of retry, and if above threshold exit the loop
            if (++retry > GIVE_UP) break
        } else {
            // at least a message has been received
            messageReceived = true
            // iterate over the received messages
            consumerRecords.forEach { record ->
                // println("Consumer Record:(%d, %s, %d, %d)\n" + record.key() + record.value() + record.partition() + record.offset())
                val data = JSONObject(record.value())
                // add the kafka timestamp
                data.put(TIMESTAMP_KAFKA, System.currentTimeMillis())
                // write to mongo
                consume(data)
            }
        }
    }
    // stop the consumer
    consumer.close()
}

fun main() {
    // create a mongodb client
    val mongoClient = MongoClients.create("mongodb://${dotenv["MONGO_DB_PERS_IP"]}:${dotenv["MONGO_DB_PERS_PORT_EXT"]}")
    val executor = Executors.newFixedThreadPool(5) // .newCachedThreadPool() Need this to limit the connections
    consumeFromKafka("kafka2mongo") { data ->
        executor.submit {
            // if the object has an imageSnapshot, replace it in the historic data
            if (data.has(IMAGE_URL)) {
                val filename = ftpImageName(data, IMAGE_URL, getExt(data.getString(IMAGE_URL)))
                data.put(IMAGE_URL, "http://${dotenv["IMAGESERVER_IP"]}:${dotenv["IMAGESERVER_PORT_HTTP_EXT"]}/${filename}")
            }
	    println("Inserting new data...")
            mongoClient
                    .getDatabase(dotenv["MONGO_DB_PERS_DB"])
                    .getCollection(data.getString(DOMAIN))
                    .insertOne(Document.parse(data.toString()))
        }
    }
    mongoClient.close()
}
