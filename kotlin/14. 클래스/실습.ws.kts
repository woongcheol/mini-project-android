// 클래스 선언
class User1 constructor(name: String) {
    val userName: String

    init {
        println(name)
        userName = name
    }
}

val user = User1("홍길동")

// 클래스 선언 2 - init 생략
class User2 constructor(name: String){
    val userName: String = name
}

val user2 = User2("심청이")

// 클래스 선언 3 - init, constructor 생략
class User3(name: String) {
    val userName: String = name
}

val user3 = User3("놀부")

// (추가)클래스 선언 5 - 모든 것을 생략
class User5(val userName: String) {}

val user5 = User5("놀부아내")
println(user5.userName)

// 클래스 선언 4 - 기본값
class User4(name: String = "흥부") {
    val userName: String = name
}

val user4 = User4()
println(user4.userName)

