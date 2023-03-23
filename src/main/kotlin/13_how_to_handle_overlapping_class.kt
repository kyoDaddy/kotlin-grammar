fun main() {

    /* 중첩 클래스를 다루는 방법

        - 중첩 클래스의 종류

        - 코틀린의 중첩 클래스와 내부 클래스

     */


}

// 이펙티브 자바에서의 권장되는 중첩 클래스
// 코틀린은 기본적으로 바깥 클래스에 대한 연결이 없는 중첩 클래스가 만들어짐
class JavaHouse1301(
    val address: String,
    val livingRoom: LivingRoom
) {
    class LivingRoom(
        private val area: Double
    )
}

// 이펙티브 자바에서의 비권장되는 중첩 클래스
// 권장되지 않는 클래스 안의 클래스
// 바깥 클래스 참조를 위해 inner 키워들 추가하고, this@바깥클래스명 을 사용하여 접근함
class JavaHouse1302(
    val address: String,
    val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse1302.address
    }
}
