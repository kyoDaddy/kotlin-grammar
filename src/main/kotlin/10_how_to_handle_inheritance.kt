fun main() {

    /*
        추상 클래스
            - 인스턴스화 할 수 없다.
        인터페이스
            - 인스턴스화 할 수 없다.

     */

    // 상위 클래스의 생성자가 실행되는 동안 하위 클래스의 프로퍼티 number 값이 초기화가 되지 않은 상태 -> 버그
    Derived10(200)




}

// 추상 클래스
// dafault로 final 임 상속하려면 open 예약어를 사용해야함
abstract class Animal10 (
    protected val species: String,
    // 추상 프로퍼티가 아니라면, override 하려면 open을 꼭 붙여줘야 함
    protected open val legCount: Int,
) {
    // 반드시 override 해야함
   abstract fun move()
}


class Cat10(
    species: String
    // 상속을 할때는 extends 가 아닌 : 사용
    // 상위 클래스의 생성자를 바로 호출함 (Animal10 주 생성자 호출)
) : Animal10(species, 4) {
    // 필수적으로 ovveride 붙여줘야 함
    override fun move() {
        println("move to cat~")
    }
}


class Penguin10(
    species: String
) : Animal10(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("move to penguin~")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}

// 인터페이스
interface Flyable {

    fun act() {
        println("ff")
    }

}


interface Swimable {

    val swimAbility: Int

    fun act() {
        println(swimAbility)
        println("ss")
    }

}


open class Base10(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived10(
    override val number: Int
) : Base10(number) {
    init {
        println("Derived Class")
    }
}


