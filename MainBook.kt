import  Books.Book as NewBooks
import BookOutput as NewOut

fun main(){
    try {
        var Books = NewOut("", "", 0, 0)
        Books.GetName()
        Books.Output_all()
        var NB = NewBooks("", "", Books.years, Books.v)
        NB.VInfo()
        NB.Year()
    }
    catch (e:Exception){
        println("Неверный формат ввода данных")
    }
}