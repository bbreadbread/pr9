import Tovar.*

class Customer(var nameC: String, var cenaC: Double, var edIzmC: String, var vidC: String ,var kC: Int): Tov(nameC, cenaC, edIzmC, vidC, kC) {
    fun GetInfoCustomer(){
        println("Имя покупателя:")
        nameC = readln()
        println("Количество купленного товара:")
        kC = readln()!!.toInt()
    }
    fun Shop(cenaC: Double)
    {
        if(k>=kC) {
            var cenaC =  kC * cenaC
            println("Полупатель купил $vidC $edIzm $vid потратил на это $cenaC рублей")
        }
        else
        {
            println("Покупателю не хватило денег на покупку.")
        }
    }
    fun OutputCustomer(){
        println("")
        println("КАРТОЧКА ПОКУПАТЕЛЯ")
        println("Покупатель: $nameC")
        println("Название купленного товара: $name")
        println("Количество купленного товара: $kC")
        if(k>=kC) {
            println("Скидка 50%: ДА")
        }
        else println("Скидка 50%: НЕТ")
        println("Сумма за единицу товара: $cenaC")
    }
}