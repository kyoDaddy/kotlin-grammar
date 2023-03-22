import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    /* 함수 (코드를 적절하게 제어하는 방법)
        -
     */

    // named argument (parameter)
    // 파이썬과 유사
    printNameAndGender(name = "최대현", gender = "female")


    var array = arrayOf("A", "B", "C")
    printAll("A", "B", "C")
    // 코틀린에서는 배열을 가변인자에 넣어줄 때 앞에 별표를 붙여줘야 함
    printAll(strings = *array)

}

// 함수 선언 문법
// public 접근지시어는 생략 가능
fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}
// 함수가 하나의 결과값이면 block 대신 = 사용 가능
// return type 추론 가능하여 생략 가능
fun max2(a: Int, b: Int) = if (a > b) a else b


// default parameter
// 자바의 오버로딩을 이걸로 대체
// 파이썬과 유사함
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true): Unit {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


// named argument (parameter)
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}


// 같은 타입의 여러 파라미터 받기 (가변인자)
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}