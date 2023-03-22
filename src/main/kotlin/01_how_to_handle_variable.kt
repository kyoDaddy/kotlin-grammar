fun main() {
    println("hi bro:)")

    // val 불변 (모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.)
    val number1 = 10L
    var number2 = 10L

    // boxing / unboxing을 고려하지 않아도 되도록 kotlin이 알아서 처리해줌
    var number3: Long = 1000L

    // null이 들어갈 수 있다고 type? 명시해줘야함
    var number4: Long? = 1000L
    number4 = null

    // 객체 생성시 new를 안붙힘
    // val person = Person("")
    // println(person.name)
    val person1 = Person("latasha")
    val person2 = Person("kyo")
    person2.introduce()

}


open class Animal(open var name: String, open var age:Int, var type:String) {
    // 상속할때 부모 클래스에 open 키워드가 존재해야 상속 가능
    open fun introduce() {
        println("${this.name} ${this.age} ${this.type}")
    }
}


class Person(override var name: String, override var age:Int) : Animal(name, age, "human") {
    // 보조 생성자 (this를 사용해 기본 생성자로 값을 넘겨줘야 한다.)
    constructor(name:String): this(name, 23)
    init {
        require(name.trim().isNotEmpty()) { "require name" }
        println("${this.name} ${this.age}")
    }
    // function-override
    override fun introduce() {
        println("ovverride")
        super.introduce()
    }

}

