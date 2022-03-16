// 함수 선언
fun hello_world(a: Int, b: Int): Int {
    var c = a + b
    return c
}

//println(hello_world(1, 2))

fun hello_world2(a: Int, b: Int): Unit {
    var c = a + b
    println(c)
}

//println(hello_world2(1, 2))

fun plusNumber(firstNum: Int, secondNum: Int): Int {
    val result: Int = firstNum + secondNum
    return result
}

// 함수를 호출하는 방법
plusNumber(firstNum = 10, secondNum = 20)
plusNumber(10, 20)

// 기본값이 있는 함수 선언
fun plusNumberWithDefault(firstNum: Int, secondNum: Int = 10): Int {
    return firstNum + secondNum
}
println(plusNumberWithDefault(10))
println(plusNumberWithDefault(10, 20))
println(plusNumberWithDefault(firstNum = 10))
//print(plusNumberWithDefault(10, secondNum = 10))


