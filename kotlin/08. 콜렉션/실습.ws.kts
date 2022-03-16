// List - mutable, immutable
val numbers = listOf<Int>(1, 2, 3)
var numbers2 = mutableListOf<Int>(1, 2, 3)
numbers2 = mutableListOf<Int>(3, 2, 3)
println(numbers2)

// Set - mutable, immutable
val number3 = setOf<Int>(1, 1, 1, 3, 3, 3, 4)
val number4 = mutableSetOf<Int>(1, 1, 1, 3, 3, 3, 4)
println(number3)

// Map - mutable, immutable
val number5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(number5)
val number6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
println(number6)
