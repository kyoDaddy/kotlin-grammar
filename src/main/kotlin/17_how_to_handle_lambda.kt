import java.util.logging.Filter

fun main() {

    /* 람다

     */


    val fruits = listOf(
        Fruit17("사과", 1000, 1),
        Fruit17("사과", 1200,2),
        Fruit17("사과", 1200,3),
        Fruit17("사과", 1500,4),
        Fruit17("바나나", 3000,5),
        Fruit17("바나나", 3200,6),
        Fruit17("바나나", 2500,7),
        Fruit17("수박", 10000,8),
    )

    // 익명함수
    val isApple: (Fruit17) -> Boolean = fun(fruit: Fruit17): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit17) -> Boolean = { fruit: Fruit17 -> fruit.name == "사과" }

    // 람다 직접 호출 방법1
    isApple(fruits[0])
    // 람다 직접 호출 방법2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    filterFruits(fruits, isApple2)
    // 마지막 함수가 파라메터인 경우 중괄호 사용 가능, 람다를 여러줄 작성할 경우 마지막 줄이 람다의 반환값
    filterFruits(fruits) { it.name == "사과" }


    // Closure
    var targetFruitName = "banana"
    targetFruitName = "melon"
    filterFruits(fruits) { it.name == targetFruitName }

    // use




}

class Fruit17(
    val name: String, val price: Int, val id: Int,
) {
    fun nullOrValue() {
        return this.nullOrValue()
    }

    val isSamePrice: Boolean
        get() = price == 1000
}

// 함수 자체를 파라메터로 받아서 과일을 필터링 해주는 함수
private fun filterFruits(
    fruits: List<Fruit17>, filter: (Fruit17) -> Boolean
): List<Fruit17> {
    /*
    val results = mutableListOf<Fruit17>()
    for (fruit in results) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
    */
    return fruits.filter(filter)
}