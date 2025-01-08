@file:JvmName("PersistImages")

package it.unibo.persistImages

import io.github.cdimascio.dotenv.Dotenv
import it.unibo.common.*
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.Executors

var KAFKA_IP: String? = null
var KAFKA_PORT_EXT: String? = null
var RAW_TOPIC: String? = null
const val GIVE_UP = 30

fun downloadImage(imageUrl: String, destinationPath: String) {
    val url = URL(imageUrl)
    val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
    connection.requestMethod = "GET"
    connection.connect()

    if (connection.responseCode == HttpURLConnection.HTTP_OK) {
        val inputStream: InputStream = connection.inputStream

        val file = File(destinationPath)

        // Ensure the parent directory exists
        file.parentFile?.mkdirs()

        FileOutputStream(file).use { outputStream ->
            inputStream.copyTo(outputStream)
        }

        println("Image downloaded successfully to $destinationPath")
    } else {
        println("Failed to download image. HTTP response code: ${connection.responseCode}")
    }
    connection.disconnect()
}

fun main(){
    val dotenv: Dotenv? = if (File(".env").exists()) Dotenv.configure().directory("./.env").load() else null
    KAFKA_IP = dotenv?.get("KAFKA_IP") ?: System.getenv("KAFKA_IP")
    KAFKA_PORT_EXT = dotenv?.get("KAFKA_PORT_EXT") ?: System.getenv("KAFKA_PORT_EXT")
    RAW_TOPIC = dotenv?.get("RAW_TOPIC") ?: System.getenv("RAW_TOPIC")
    val executor = Executors.newFixedThreadPool(5) // .newCachedThreadPool() Need this to limit the connections
    consumeFromKafka("$KAFKA_IP:$KAFKA_PORT_EXT","persistImages", RAW_TOPIC.toString(), GIVE_UP) { data ->
        executor.submit {

            val imageUrlKeyValues = findPatternOccurrenceInJSONValues(data, imagePattern, "")
            for ((keyPath, value) in imageUrlKeyValues) {
                val destinationPath = "/mnt/data/"+computeImagePath(data, keyPath, getExt(value as String))
                downloadImage(value, destinationPath)
                println("Image downloaded successfully to $destinationPath")
            }
        }
    }
}


