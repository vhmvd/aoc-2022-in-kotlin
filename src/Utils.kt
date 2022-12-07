import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src/${name.substringBefore("_").lowercase()}", "$name.txt")
    .readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

fun getSumOfConcatStringInt(str: String): Int {
    val list = str.split(",")
    var sum = 0
    list.forEach {
        sum += it.toInt()
    }
    return sum
}
