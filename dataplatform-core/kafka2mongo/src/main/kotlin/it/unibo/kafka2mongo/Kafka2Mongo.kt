@file:JvmName("Kafka2Mongo")

package it.unibo.kafka2mongo

import com.mongodb.client.MongoClients
import com.mongodb.client.model.Filters
import com.mongodb.client.model.ReplaceOptions
import io.github.cdimascio.dotenv.Dotenv
import it.unibo.common.*
import org.bson.Document
import org.json.JSONObject
import java.io.File
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

fun computeImageUrl(obj: JSONObject, attr: String, ext: String): String {
    val baseUrl = "$IMAGESERVER_PROTOCOL://$IMAGESERVER_IP:$IMAGESERVER_PORT_HTTP_EXT"
    return "$baseUrl${computeImagePath(obj, attr, ext)}"
}

fun updateImageUrls(jsonObject: JSONObject): JSONObject {
    val imageUrlKeyValues = findPatternOccurrenceInJSONValues(jsonObject, imagePattern, "")

    for ((keyPath, value) in imageUrlKeyValues) {
        jsonObject.setNestedValue(keyPath,computeImageUrl(jsonObject, keyPath, getExt(value.toString())))
    }
    return jsonObject
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
    consumeFromKafka("$KAFKA_IP:$KAFKA_PORT_EXT","kafka2mongo", RAW_TOPIC.toString(), GIVE_UP) { data ->
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
