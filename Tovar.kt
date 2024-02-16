package Tovar

open class Tov(var name: String, var cena: Double, var edIzm: String, var vid: String, var k: Int){
    fun GetInfoTovar(){
        println("Название товара:")
        name = readln()
        println("Цена:")
        cena = readln()!!.toDouble()
        println("Единицы измерения:")
        edIzm = readln()
        println("Вид товара:")
        vid = readln()
        println("Количество товара:")
        k = readln()!!.toInt()
    }
    fun Sale():Double{
        if (k<=15) cena = cena * 50 / 100
        return cena
    }

}