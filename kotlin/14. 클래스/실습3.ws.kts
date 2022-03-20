// getter, setter
class Book() {
    var title: String = "모름"
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

val book = Book()
println(book.title)
book.title = "제목없음"
println(book.title)

// lateinit
class Book2() {
    lateinit var title: String

    fun nextPage() {
        if (::title.isInitialized) {
            println("페이지가 넘어간다.")
        } else {
            println("초기화 필요")
        }

    }
}

val book2 = Book2()
book2.title = "책 이름"
println(book2.nextPage())
println(book2.title)

//lazy
class Book3() {
    val title: String by lazy {
        println("lazy 초기화")
        "첵 제목"
    }
}

var book3 = Book3()
println(book3.title)