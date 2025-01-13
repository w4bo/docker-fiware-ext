package it.unibo.common

import org.apache.kafka.clients.consumer.Consumer
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer
import org.json.JSONObject
import java.time.Duration
import java.util.*
import java.util.regex.Pattern


fun consumeFromKafka(kafkaServer:String, group: String, topic: String, giveUp: Int, consume: (JSONObject) -> Unit) {
    // configuring the kafka client
    val props = Properties()
    props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = kafkaServer
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
    val pattern: Pattern = Pattern.compile("^$topic.*")
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
            if (++retry > giveUp) break
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