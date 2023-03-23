fun main() {

    /* 다양한 클래스를 다루는 방법

        - Data class

        - Enum Class

        - Sealed Class, Sealed Interface

     */


    val a = PersonDto14("kyo", 1)
    val b = PersonDto14("kyo", 2)
    println(a == b)
    println(a)
    println(b)






}

// dto class
data class PersonDto14(
    val name: String,
    val age: Int,
)

// enum class
enum class Country14(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}


fun handleCountry14(country14: Country14) {
    when (country14) {
        Country14.KOREA -> TODO()
        Country14.AMERICA -> TODO()
    }
}


/*
// Sealed Class, Sealed Interface
    - 상속이 가능하도록 추상클래스를 만드는데, 외부에서는 이 클래스를 상속받지 않도록.. --> 하위 클래스를 봉인하자!
    - 컴파일 타임 때 하위 클래스의 타입을 모두 기억 (핵심)
    - 하위 클래스는 같은 패키지에 있어야함

    - enum과 다른 점
        - 클래스를 상속받을 수 있음
        - 하위 클래스는 멀티 인스턴스가 가능

    - 추상화가 필요한 Entity or DTO에 sealed class를 활용
*/
sealed class HyundaiCar14(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar14("a", 1000L)
class Sonata : HyundaiCar14("s", 2000L)
class Grandeur : HyundaiCar14("g", 3000L)

private fun handelCar14(car: HyundaiCar14) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Grandeur -> TODO()
    }
}

