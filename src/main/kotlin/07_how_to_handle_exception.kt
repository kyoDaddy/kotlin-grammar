import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    /* 예외
        -
     */

}

// try catch finally 문법은 자바와 동일
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아니쥬?")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        null
    }
}

class FilePrinter {
    // checked exception과 unchecked exception
    // 코틀린은 모두 unchecked exception으로 간주함
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    // try with resources
    // 코틀린은 use라는 inline 확장함수를 사용함
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }

}



