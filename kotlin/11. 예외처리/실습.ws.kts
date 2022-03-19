// try, catch, finally
val numbers = listOf<Int>(1, 2, 3)
try {
    numbers.get(5)
}catch (exception: ArrayIndexOutOfBoundsException) {
    println("예외발생 A")
}catch (exception: IllegalAccessError) {
    println("예외발생 B")
}finally {
    println("마지막")
}