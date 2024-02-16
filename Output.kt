import Books.*

class BookOutput(var nameA: String, var authorA: String, var yearsA: Int, var vA: Int): Book(nameA, authorA, yearsA, vA) {
    fun Output_all() {
        println("Название книги: $name")
        println("Автор: $author")
        println("Год: $years")
        println("Объем: $v")
    }

}