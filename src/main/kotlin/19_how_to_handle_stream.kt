fun main() {

    /* 컬렉션 -> 함수형 다루기

        - 필터와 맵

        - 다양한 컬렉션 처리 기능

        - List를 Map으로

        - 중첩된 컬렉션 처리


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

    // filter index
    val apples = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    // map
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price }

    // map index
    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.price
        }

    // map not null
    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.nullOrValue() }

    // all
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // any
    val isNoApple = fruits.any { fruit -> fruit.price >= 10000 }

    // count
    val fruitCount = fruits.count()

    // sortedBy (오름차순)
    val fruitCountSortedBy = fruits.sortedBy { fruit -> fruit.price }
    // sortedBy (내림차순)
    val fruitCountSortedByDescending = fruits.sortedByDescending { fruit -> fruit.price }
    // distinctBy (변형된 값을 기준으로 중복 제거)
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first (첫번째 값) / firstOrNull (첫번째 값 or null 값)
    fruits.first()
    fruits.firstOrNull()
    fruits.last()
    fruits.lastOrNull()


    // List -> Map
    val map: Map<String, List<Fruit17>> = fruits.groupBy { fruit -> fruit.name }

    // id -> 과일 (중복되지 않는 키를 가지고 맵을 만듬)
    //val map2: Map<String, Fruit17> = fruits.associateBy { fruit -> fruit.id }

    // val map3: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name }, { fruit -> fruit.price })
    // val map4: Map<String, List<Long>> = fruits.fruits({ fruit -> fruit.id }, { fruit -> fruit.price })

    val map5: Map<String, List<Fruit17>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }


    val fruitsInList: List<List<Fruit17>> = listOf(
        listOf(
            Fruit17("사과", 1000, 1),
            Fruit17("사과", 1200, 2),
            Fruit17("사과", 1200, 3),
            Fruit17("사과", 1500, 4),
        ),
        listOf(
            Fruit17("바나나", 3000, 5),
            Fruit17("바나나", 3200, 6),
            Fruit17("바나나", 2500, 7),
        ),
        listOf(
            Fruit17("수박", 10000, 8),
        )
    )

    // flatMap
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.price == 1000 }
    }
    // flatten
    fruitsInList.flatten()


}
