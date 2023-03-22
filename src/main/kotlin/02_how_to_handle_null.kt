fun main() {

    val str: String? = null
    // Elvis 연산자 (?앞에 있는 변수는 null 이 아니다라고 가정, null 이면 전체가 null이 됨)
    println(str?.length ?: 0)

    // kotlin은 자바 코드로 만든 객체의 어노테이션(Nullable, NotNull..)을 이해함, 플랫폼 타입 정보가 없으면 실행은 가능하지만 런타임 오류가 발생함

}

// kotlin 에서 null 체크
fun startWithA1(str: String?): Boolean {
    /*
    if(str == null) {
        throw IllegalArgumentException("error null!")
    }
    return str.startsWith("A")
    */
    return str?.startsWith("A") ?: throw IllegalArgumentException("error null!")
}


fun startWithA2(str: String?): Boolean? {
    /*
    if (str == null) {
        return null
    }
    return str.startsWith("A")
    */
    return str?.startsWith("A")
}


fun startWith3(str: String?): Boolean? {
    /*
    if (str == null) {
        return false
    }
    return str.startsWith("A")
    */
    return str?.startsWith("A") ?: false
}


fun startWith4(str: String?): Boolean {
    // null 아님 단언
    return str!!.startsWith("A")
}



