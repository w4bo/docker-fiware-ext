package it.unibo.common

import it.unibo.DOMAIN
import it.unibo.ID
import it.unibo.TIMESTAMP_SUBSCRIPTION
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*

fun computeImagePath(obj: JSONObject, attr: String, ext: String): String {
    val id = obj.getString(ID)
    val domain = obj.getString(DOMAIN)
    val date = Date(obj.getLong(TIMESTAMP_SUBSCRIPTION))
    val jdf = SimpleDateFormat("yyyy-MM-dd")
    val jdf2 = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSSZ")
    return "/$domain/$id/" + jdf.format(date) + "/" + jdf2.format(date) + "_" + id + "_" + attr.replace(
        ".",
        "_"
    ) + ext
}