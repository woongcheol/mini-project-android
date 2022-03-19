// 고차함수
fun function1(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun function2(function: (Int, Int) -> Int) {
    val result: Int = function(10, 9)
    println("결과는 ${result} 입니다.")
}
function2(::function1)

// 람다
val addTenNine: (Int, Int) -> Int = { number1: Int, number2: Int ->
    number1 + number2
}
function2(addTenNine)

val addTenNine2: (Int, Int) -> Int = { number1, number2 ->
    number1 + number2
}
function2(addTenNine2)

val addTenNine3 = { number1: Int, number2: Int ->
    number1 + number2
}
function2(addTenNine3)
function2 { number1, number2 -> number1 + number2 }

val addTenNine4: () -> Int = {
    10 + 9
}

val addTenNine5: (Int) -> Int = {
    10 +9
}