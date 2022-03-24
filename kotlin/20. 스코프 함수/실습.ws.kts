class Person(var name: String? = null, var age: Int? = null) {}

// Scope Function - apply(객체 초기화)
val gildong = Person().apply {
    name = "길동"
    age = 20
}
// Scope Function - also(유효성 검사)
val gildong2 = Person("victor").also {
    nameIsGildong(it.name)
}

// Scope Function - run(특정 계산 결과 확인)
val ageAfter10year = Person("gildong", 10).run {
    age!! + 10
}

// Scope Function - with(특정 계산 결과 확인), nullale 타입을 받지 못한다.
val ageAfter10year2 = with(Person("gildong", 10)) {
    age!! + 10
}

// Scope Function - let(특정 계산 결과 확인)
val gildong2 = Person("victor").let {
}