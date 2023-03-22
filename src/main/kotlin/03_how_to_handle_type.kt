fun main() {

    val number1 = 3
    // 명시적 형변환 필요
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long? = number1?.toLong() ?: 0L

    /*
    - Any (java object와 동일)
    - Unit (java void와 동일)
    - Nothing (함수가 정상적으로 끝나지 않았다는 사실을 표현)
    */

    // string format 은 파이썬 f"{variable_name}"와 유사
    val person = Person("kk", 10)
    val log = "사람의 이름 ${person.name} 나이는 ${person.age} 이다."

    // 특정 문자열 가져오기
    var str: String = "ABC"
    println("${str[0]} ${str[1]}")

}


// object 형변환시 (코틀린에서는 Any)
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        /* 코틀린에서는 생략 가능
        val person = obj as Person
        println(person.name)
        */
        println(obj.name)
    }

    // not is 처리
    if (obj !is Person) {

    }

    val person = obj as? Person
    println(person?.age)

}