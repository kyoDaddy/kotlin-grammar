fun main() {

    /* 반목문
        - 자바와 거의 유사
     */

    // for-each
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // for
    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    // progression과 range
    // .. 연산자 : 범위를 나타내는 연산자
    // 코틀린에서 전통적인 for문은 등차수열과 in을 이용함
    for (i in 1..3) {

    }

    // while
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }


}