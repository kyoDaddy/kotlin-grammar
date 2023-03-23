fun main() {

    /* 다양한 함수를 다루는 방법
        - 확장함수
            1. 클래스에 있는 private or protected 멤버를 가져올 수 없다.
            2. 확장함수와 멤버함수의 시그니처가 동일하면 멤버함수가 우선적으로 호출된다.
            3. 해당 변수의 현재 타입, 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.

        - infix 함수

        - inline 함수

        - 지역함수

     */


    val str = "ABC"
    println(str.lastChar())

    val a = 1
    println( a.add(2) )
    println( a.add2(2) )
    println( 3 add2 4)



}

// 확장함수
// 원래 String에 있는 멤버함수 처럼 사용할 수 있다.
fun String.lastChar(): Char {
    return this[this.length -1 ]
}

// 중위함수
// downTo, step도 함수임
fun Int.add(other: Int): Int {
    return this + other
}
infix fun Int.add2(other: Int): Int {
    return this + other
}

// inline함수
// 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우


// 지역함수
