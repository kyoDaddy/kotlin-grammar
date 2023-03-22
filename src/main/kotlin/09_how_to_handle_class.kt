fun main() {

    /* 클래스
        -
     */

    val person = Person092("kyo")
    val person2 = Person092()


}


// 코틀린에서는 필드만 만들면, getter, setter를 자동으로 만들어준다.
public class Person091 constructor(name: String, age: Int) {
    val name = name
    var age = age
}

// 주 생성자 primary constructor 는 생성자 생략 가능
// 클래스의 필드 선언과 생성자를 동시에 선언 가능
public class Person092 (
    val name: String,
    var age: Int
) {


    /* name get custom
    // case 1 : 주 생성자에서 받은 name을 불변 프로퍼티 name에 바로 대입
    val name = name
        // name -> get() 무한루프 발생을 막기 위한 예약어, field는 자기 자신을 가리킴 (backing field) -> 거의 사용 안함
        get() = field.uppercase()

    // case 2 : 함수 활용
    fun getUppercaeName(): String {
        return this.name.uppercase()
    }
    // case 3 : custom property 활용
    val uppercaseName: String
        get() = this.name.uppercase()
    */

    /* name set custom
        - setter 자체를 지양하기 때문에 custom setter도 잘 안씀다.
    */


    // 클래스 초기화 시점에 한번 호출
    init {
      if (age <= 0) {
          throw Exception("나이는 ${age} 일 수 없습니다.")
      }
        println("init block")
    }
    // 부생성자로 위 this로 선언되어 있는 주생성자를 호출
    // 있을 수도 있고, 없을 수도 있다. 최종적으로 주생성자를 호출해야함
    constructor(name: String): this(name, 1) {
        println("second constructor")
    }

    // 역순으로 올라간다음 init body -> constructor 생성자가 수행됨
    // 거의 쓸일 없고, 쓸려면 차라리 정적 팩토리 메소드를 추천
    constructor(): this("latasha") {
        println("third constructor")
    }

    /* custom getter case1 -> 함수로 만들 수 있음
    fun isAdult(): Boolean {
        return this.age >=  20
    }
    */

    // custom getter case2 -> 프로퍼티처럼 만들 수 있음
    val isAdult: Boolean
        get() = this.age >= 20



}