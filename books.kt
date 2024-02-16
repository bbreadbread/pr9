package Books

open class Book(var name: String, var author: String, var years: Int, var v: Int){

    fun GetName(){
        println("Название книги:")
        name = readln()
        println("Автор:")
        author = readln()
        println("Год:")
        years= readln()!!.toInt()
        println("Страниц:")
        v = readln()!!.toInt()
    }
    public fun VInfo()
    {
        var v = v
        if(v<=200) println("Тонкая, не объемная книга")
        else if(v>200 && v <500)println("Средняя по объему книга")
        else println("Крупная, большая по объему книга")
    }
    public fun Year(){
        var years = years
        if (years in 1600 .. 1785){
            println("Эпоха классицизма")}
        else if (years in 1786.. 1829) {
            println("Эпоха синтиментализма")}
        else if (years in 1830.. 1850){
            println("Эпоха романтизма")}
        else if (years in 1851.. 1900){
            println("Эпоха реализма")}
        else if (years in 1901.. 1950){
            println("Эпоха модернизма")}
        else if (years in 1951.. 2000) {
            println("Эпоха постмодернизма")}
        else if (years > 2000){
            println("Современная литература")}
        else {
            println("Древняя литература..")}
    }
}


