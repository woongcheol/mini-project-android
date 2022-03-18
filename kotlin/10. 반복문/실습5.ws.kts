// 인덱스만 필요할 때
val numbers = listOf<Int>(1, 2, 3, 4, 5)
for (index in numbers.indices){
    println(index)
}

numbers.forEachIndexed { index, i ->
    println(index)
    println(i)
}