// 클래스 선언 - 부생성자
class User constructor(name: String) {
    var age: Int = 0
    val name: String

    init {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

val user = User(name = "홍길동")
println(user.name)

val user2 = User("놀부", 20)
println(user2.age)

// 클래스 선언 - 주 생성자 생략
class User2 {
    val age: Int
    val name: String

    constructor(age: Int, name: String) {
        this.age = age
        this.name = name
    }
}