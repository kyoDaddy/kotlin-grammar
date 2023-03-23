fun main() {

    /* object 키워드 다루는 법

        - static 함수와 변수

        - 싱글톤

        - 익명 클래스

     */


    val person = Person12.Factory
    person.newBaby("kyo")
    person.log()

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 코틀린에서는 object : 타입이름 으로 익명 클래스를 선언하여 구성
    moveSomething(object : Movable12{
        override fun move() {
            println("move move")
        }

        override fun fly() {
            println("fly fly")
        }
    })


}

// static 함수와 변수
class Person12 private constructor(
    var name: String,
    var age: Int
) {
    // static 대신 companion object (클래스와 동행하는 유일한 오브젝트) 사용
    companion object Factory : Log12 {
        // const -> 컴파일 시에 변수가 할당됨 (진짜 상수)
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person12 {
            return Person12(name, MIN_AGE)
        }

        override fun log() {
            println("hi person class compaion object!")
        }
    }

}

interface Log12 {
    fun log()
}


// 싱글톤 (단 하나의 인스턴스만을 갖는 클래스를 싱글톤이라고 부름)
object Singleton {
    var a: Int = 0
}


// 익명 클래스 (특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스)
private fun moveSomething(movable: Movable12) {
    movable.move()
    movable.fly()
}


interface Movable12 {
    fun move()
    fun fly()
}


