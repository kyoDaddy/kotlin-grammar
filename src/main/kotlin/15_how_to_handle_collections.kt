import org.codehaus.groovy.syntax.Numbers
import java.util.*

fun main() {

    /* 배열 및 컬렉션 다루는 방법

        - 배열

        - 코틀린에서의 Collection - List, Set, Map
            - 가변 컬렉션
                - 컬렉션에 element를 추가/삭제 가능
            - 불변 컬렉션
                - 컬렉션에 element를 추가/삭제 불가

        - 컬렉션의 null 가능성, 자바와 함께 사용하기

     */

    // 배열
    val array = arrayOf(100, 200)
    for (i in array.indices) {
        println("$i ${array[i]}")
    }
    for ((idx, value) in array.withIndex()) {
        println("$idx, $value")
    }
    array.plus(300)

    // collection

    // 코틀린은 불변/가변 을 정의를 해주고 시작해야함
    // 기본적으로 불변임

    // list
    val numbers = listOf(100, 200)
    // 추론 가능하면 type 생략 가능
    val emptyList = emptyList<Int>()
    printNumbers(emptyList())

    // numbers.get(0) == numbers[0]
    println(numbers[0])
    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx, $value")
    }

    // 가변 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    // set
    val numberSets = setOf(100, 200)
    val numberSets2 = mutableSetOf(100, 200)

    // map (type 추론 불가)
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "Monday", 2 to "TUESDAY")
    mutableMapOf(1 to "Monday", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println("$key $value")
    }


    // 컬렉션의 null 가능성, 자바와 함께 사용하기



}

private fun printNumbers(numbers: List<Int>) {

}

