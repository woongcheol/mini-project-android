// 배열 선언 방법 - 1
var array1 = arrayOf<Int>(10, 20, 30)
var array2 = arrayOf<Double>(10.0, 20.0, 30.0)
var array3 = intArrayOf(10, 20, 30)
var array4 = booleanArrayOf(true, false, false)

// 배열 선언 방법 - 2
var array5 = Array(10, { 0 })
var array6 = IntArray(10, { 0 })
var array7 = DoubleArray(10, { 0.0 })

// 배열 선언 방법 - 3
var array8 = Array(10, { 0 })
var array9 = Array<Int>(10, { 0 })
var array10 = Array<String>(10, { "Hi" })

// 배열 값 넣기
array10[1] = "Hello"
array10.set(2, "Hello World ")
println(array10)

// 배열 값 불러오기
println(array10[1])
println(array10.get(2))
