import java.util.logging.Filter

fun main() {

    /* 기타
        - type alias 와 as import

        - 구조분해와 componentN 함수

        - jump와 label

        - takeif와 takeunless


     */

    // 구조분해 문법 (component N)
    val person = Person191("kyo", 100)
    val (name, age) = person
    //val name = person.component1()
    //val age = person.component2()
    println("이름: ${name}, 나이 : $age")

    // takeif


}

// type alias
typealias  FruitFilter18 = (Fruit17) -> Boolean

fun filterFruits18(fruits: List<Fruit17>, filter: FruitFilter18) {

}


data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

// as import


data class Person191(
    val name: String,
    val age: Int
)

class Person192(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun getNumberOfNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}
// takeif : 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null 반환
fun getNumberOfNull2(number: Int): Int? {
    return number.takeIf { it > 0 }
}
// takeunless : 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 null 반환
fun getNumberOfNull3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}