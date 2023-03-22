fun main() {

    /* 조건문
        if => 자바와 동일
            - 자바에서는 if-else는 statement이지만, 코틀린에서는 expression
            - 코틀린은 삼항 연산자가 없다.

        switch => when
            - 조금 더 다양하게 사용 가능
            - enum, sealed class와 함께 사용시 더욱더 진가를 발휘
     */

}

fun validateScoreIsNotNagative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0 ~ 100 안에 존재해야합니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "M"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    }  else {
        "M"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80.. 90 -> "B"
        in 70 .. 80 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("yes! $number")
        else -> println("no!")
    }
}