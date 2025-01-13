package it.unibo.common

import org.json.JSONArray
import org.json.JSONObject
import java.util.regex.Pattern

fun findPatternOccurrenceInJSONValues(obj: Any, pattern: Pattern, previousKey: String): List<Pair<String, Any>> {
    val matchedKeyValues = mutableListOf<Pair<String, Any>>()

    when (obj) {
        is JSONObject -> {
            for (key in obj.keys()) {
                val value = obj[key]
                if (value is String && pattern.matcher(value).matches()) {
                    matchedKeyValues.add(Pair(if (previousKey.isNotEmpty()) "$previousKey.$key" else key, value))
                } else {
                    if (value is JSONObject || value is JSONArray)
                        matchedKeyValues.addAll(
                            findPatternOccurrenceInJSONValues(
                                value,
                                pattern,
                                if (previousKey.isNotEmpty()) "$previousKey.$key" else key
                            )
                        )  // Recursively search nested objects
                }
            }
        }

        is JSONArray -> {
            for (i in 0 until obj.length()) {
                val value = obj[i]
                if (value is String && pattern.matcher(value).matches()) {
                    matchedKeyValues.add(Pair(if (previousKey.isNotEmpty()) "$previousKey.$i" else "$i", value))
                } else {
                    if (value is JSONObject || value is JSONArray)
                        matchedKeyValues.addAll(
                            findPatternOccurrenceInJSONValues(
                                value,
                                pattern,
                                if (previousKey.isNotEmpty()) "$previousKey.$i" else "$i"
                            )
                        )
                }
            }
        }
    }
    return matchedKeyValues
}

fun JSONObject.setNestedValue(keyPath: String, value: Any) {
    val keys = keyPath.split(".")
    var currentObject: Any = this
    for (i in 0 until keys.size - 1) {
        val key = keys[i]

        currentObject = when (currentObject) {
            is JSONObject -> currentObject.get(key)
            is JSONArray -> {
                val index = key.toIntOrNull()
                if (index != null && index in 0 until (currentObject).length()) {
                    currentObject.get(index)
                } else {
                    throw IllegalArgumentException("Invalid key path: $keyPath! The object does not contain it!")
                }
            }

            else -> {}
        }
    }

    // Set the value for the last key
    when (currentObject) {
        is JSONObject -> currentObject.put(keys.last(), value)
        is JSONArray -> {
            val index = keys.last().toIntOrNull()
            if (index != null && index in 0 until currentObject.length()) {
                currentObject.put(index, value)
            }
        }
    }
}

fun JSONObject.getNestedValue(keyPath: String): Any {

    val keys = keyPath.split(".")
    var currentObject: Any = this
    for (i in 0 until keys.size - 1) {
        val key = keys[i]

        currentObject = when (currentObject) {
            is JSONObject -> currentObject.get(key)
            is JSONArray -> {
                val index = key.toIntOrNull()
                if (index != null && index in 0 until (currentObject).length()) {
                    currentObject.get(index)
                } else {
                    throw IllegalArgumentException("Invalid key path: $keyPath! The object does not contain it!")
                }
            }
            else -> {}
        }
    }

    // Get the value for the last key
    when (currentObject) {
        is JSONObject -> return currentObject.get(keys.last())
        is JSONArray -> {
            val index = keys.last().toIntOrNull()
            if (index != null && index in 0 until currentObject.length()) {
                return currentObject.get(index)
            }
        }
    }

    throw IllegalArgumentException("Invalid key path: $keyPath! The object does not contain it!")
}