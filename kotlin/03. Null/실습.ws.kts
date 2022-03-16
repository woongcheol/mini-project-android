// Null 작성
val number: Int? = null
// val number2: Int = null 불가

// Null 타입에 할당 시 주의 - Null 대비 할당 제한
val number1: Int? = 10
val number2: Int? = 3 + 5
// val number3: Int? = number1 + number2 오류 발생
// println(number3) 오류 발생

// Null 타입에 할당 시 제한사항 해제
val num3: Int? = number1!! + number2!!
println(num3)

// 비교 연산은 가능
if(null == 5) {
    println("same")
} else {
    println("not same")
}

if(null == null) {
    println("same")
} else {
    println("not same")
}