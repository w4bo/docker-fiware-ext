package it.unibo.common

import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

val imageExtension = listOf("jpg", "jpeg", "png", "svg", "gif", "bmp", "webp")

// Regular expression pattern for image file extensions
val imagePattern = Pattern.compile(".*\\.(${imageExtension.joinToString(separator = "|")})$", Pattern.CASE_INSENSITIVE)

/**
 * Return the extension if known
 * E.g., it should return no extension for URLs like http://81.60.229.210:12356/snapshot?topic%3D/front_camera_rgb
 */
fun getExt(curUrl: String): String {
    val ext = curUrl.substring(curUrl.lastIndexOf(".") + 1).lowercase()
    return if (imageExtension.contains(ext)) ".$ext" else ""
}

fun computeImagePath(obj: JSONObject, attr: String, ext: String): String {
    val id = obj.getString(ID)
    val domain = obj.getString(DOMAIN)
    val date = Date(obj.getLong(TIMESTAMP_SUBSCRIPTION))
    val jdf = SimpleDateFormat("yyyy-MM-dd")
    val jdf2 = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSSZ")
    jdf.timeZone = TimeZone.getTimeZone("Europe/Rome")
    jdf2.timeZone = TimeZone.getTimeZone("Europe/Rome")

    return "/files/image-archive/$domain/$id/" + jdf.format(date) + "/" + jdf2.format(date) + "_" + id + "_" + attr.replace(
        ".",
        "_"
    ) + ext
}