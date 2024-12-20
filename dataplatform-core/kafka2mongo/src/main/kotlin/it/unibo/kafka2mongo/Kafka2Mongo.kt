@file:JvmName("Kafka2Mongo")

package it.unibo.kafka2mongo

import com.mongodb.client.MongoClients
import com.mongodb.client.model.Filters
import com.mongodb.client.model.ReplaceOptions
import io.github.cdimascio.dotenv.Dotenv
import it.unibo.*
import it.unibo.common.findPatternOccurrenceInJSONValues
import it.unibo.common.setNestedValue
import org.apache.kafka.clients.consumer.Consumer
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer
import org.bson.Document
import org.json.JSONObject
import java.io.File
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.*
import java.util.concurrent.Executors
import java.util.regex.Pattern

// NB: comments from the dotenv file will be loaded as strings as well! Be careful!
var KAFKA_IP: String? = null
var KAFKA_PORT_EXT: String? = null
var RAW_TOPIC: String? = null
var MONGO_DB_PERS_IP: String? = null
var MONGO_DB_PERS_PORT_EXT: String? = null
var IMAGESERVER_PROTOCOL: String? = null
var IMAGESERVER_IP: String? = null
var IMAGESERVER_PORT_HTTP_EXT: String? = null
var MONGO_DB_PERS_DB: String? = null
var MONGO_DB_CURRENT_STATE_DB: String? = null
var MONGO_DB_CURRENT_STATE_COLLECTION: String? = null
const val GIVE_UP = 30

val imageExtension = listOf("jpg", "jpeg", "png", "svg", "gif", "bmp", "webp")

/**
 * Return the extension if known
 * E.g., it should return no extension for URLs like http://81.60.229.210:12356/snapshot?topic%3D/front_camera_rgb
 */
fun getExt(curUrl: String): String {
    val ext = curUrl.substring(curUrl.lastIndexOf(".") + 1).lowercase()
    return if (imageExtension.contains(ext)) ".$ext" else ""
}

fun computeImageName(obj: JSONObject, attr: String, ext: String): String {
    val baseUrl = "$IMAGESERVER_PROTOCOL://$IMAGESERVER_IP:$IMAGESERVER_PORT_HTTP_EXT"
    val id = obj.getString(ID)
    val domain = if (obj.has(DOMAIN)) obj.getString(DOMAIN) else obj.getString(AREA_SERVED)
    val date = Date(obj.getLong(TIMESTAMP_SUBSCRIPTION))
    val jdf = SimpleDateFormat("yyyy-MM-dd")
    val jdf2 = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSSZ")
    return "$baseUrl/$domain/$id/" + jdf.format(date) + "/" + jdf2.format(date) + "_" + id + "_" + attr.replace(
        ".",
        "_"
    ) + ext
}

fun updateImageUrls(jsonObject: JSONObject): JSONObject {
    // Regular expression pattern for image file extensions
    val imagePattern =
        Pattern.compile(".*\\.(${imageExtension.joinToString(separator = "|")})$", Pattern.CASE_INSENSITIVE)
    val imageUrlKeyValues = findPatternOccurrenceInJSONValues(jsonObject, imagePattern, "")

    for ((keyPath, value) in imageUrlKeyValues) {
        jsonObject.setNestedValue(keyPath,computeImageName(jsonObject, keyPath, getExt(value.toString())))
    }
    return jsonObject
}

fun consumeFromKafka(group: String, consume: (JSONObject) -> Unit) {
    // configuring the kafka client
    val props = Properties()
    props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = "${KAFKA_IP}:${KAFKA_PORT_EXT}"
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
    val pattern: Pattern = Pattern.compile("^${RAW_TOPIC}.*")
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
    val dotenv: Dotenv? = if (File(".env").exists()) Dotenv.configure().directory("./.env").load() else null
    KAFKA_IP = dotenv?.get("KAFKA_IP") ?: System.getenv("KAFKA_IP")
    KAFKA_PORT_EXT = dotenv?.get("KAFKA_PORT_EXT") ?: System.getenv("KAFKA_PORT_EXT")
    RAW_TOPIC = dotenv?.get("RAW_TOPIC") ?: System.getenv("RAW_TOPIC")
    MONGO_DB_PERS_IP = dotenv?.get("MONGO_DB_PERS_IP") ?: System.getenv("MONGO_DB_PERS_IP")
    MONGO_DB_PERS_PORT_EXT = dotenv?.get("MONGO_DB_PERS_PORT_EXT") ?: System.getenv("MONGO_DB_PERS_PORT_EXT")
    MONGO_DB_PERS_DB = dotenv?.get("MONGO_DB_PERS_DB") ?: System.getenv("MONGO_DB_PERS_DB")
    MONGO_DB_CURRENT_STATE_DB = dotenv?.get("MONGO_DB_CURRENT_STATE_DB") ?: System.getenv("MONGO_DB_CURRENT_STATE_DB")
    IMAGESERVER_PROTOCOL = dotenv?.get("IMAGESERVER_PROTOCOL") ?: System.getenv("IMAGESERVER_PROTOCOL")
    IMAGESERVER_IP = dotenv?.get("IMAGESERVER_IP") ?: System.getenv("IMAGESERVER_IP")
    IMAGESERVER_PORT_HTTP_EXT = dotenv?.get("IMAGESERVER_PORT_HTTP_EXT") ?: System.getenv("IMAGESERVER_PORT_HTTP_EXT")
    MONGO_DB_CURRENT_STATE_COLLECTION =
        dotenv?.get("MONGO_DB_CURRENT_STATE_COLLECTION") ?: System.getenv("MONGO_DB_CURRENT_STATE_COLLECTION")

    // create a mongodb client
    val mongoClient = MongoClients.create("mongodb://${MONGO_DB_PERS_IP}:${MONGO_DB_PERS_PORT_EXT}")
    val executor = Executors.newFixedThreadPool(5) // .newCachedThreadPool() Need this to limit the connections
    consumeFromKafka("kafka2mongo") { data ->
        executor.submit {
            // if the object has an imageSnapshot, replace it in the historic data

            val enrichedData: JSONObject = updateImageUrls(data)

            println("Inserting new data...")
            mongoClient
                .getDatabase(MONGO_DB_PERS_DB)
                .getCollection(enrichedData.getString(DOMAIN))
                .insertOne(Document.parse(enrichedData.toString()))

            enrichedData.put("_id", enrichedData.get(ID))
            mongoClient.getDatabase(MONGO_DB_CURRENT_STATE_DB).getCollection(MONGO_DB_CURRENT_STATE_COLLECTION)
                .replaceOne(
                    Filters.eq("_id", enrichedData.get(ID)),
                    Document.parse(enrichedData.toString()),
                    ReplaceOptions().upsert(true)
                )
        }
    }
    mongoClient.close()
}
