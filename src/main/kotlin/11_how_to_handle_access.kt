fun main() {

    /* 접근제어
        - public 모든 곳에서 접근 가능
        - protected 선언된 클래스 또는 하위 클래스에서만 접근 가능
            - 코틀린에서는 패키지를 namespace 관리하기 위한 용도로만 사용
        - default -> internal 같은 모듈에서만 접근 가능
            - 모듈 : 한번에 컴파일 되는 코틀린 코드
        - private 선언된 클래스 내에서만 접근 가능


        - 코틀린은 기본 접근 제시어는 public

     */


    // 자바와 코틀린의 가시성 제어

    // 코틀린 파일의 접근 제어

    // 다양한 구성요소의 접근 제어

    // 자바와 코틀린을 함께 사용할 경우 주의할 점


}


fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set

}



