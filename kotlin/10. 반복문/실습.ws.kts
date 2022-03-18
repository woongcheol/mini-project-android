// for 문
val number = 1..10
for (i in number) {
    println(i)
}

val number2 = 1..5
for (i in number2 step 2) {
    println(i)
}

val number3 = listOf<Int>(0, 1, 2, 3)
for (num in number3) {
    println(num)
}

for (num in 0..number3.size) {
    println(num)
}

for (num in 0 until number3.size) {
    println(num)
}

for ((index, numb) in number3.withIndex()) {
    println(index + numb)
}

// forEach
number3.forEach { number ->
    println(number)
}