// getter, setter
class Book() {
    var title : String = "모름"
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