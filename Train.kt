package Train

open class Train(var station: String,  var time: String,  var date: String) {
    open fun GetInfoOrder(){
        println("Станция назначения:")
        station = readLine()!!.toString()
        println("Время поздки:")
        time = readLine()!!.toString()
        println("Дата поездки:")
        date = readLine()!!.toString()
    }
    fun OutInfoOrder(){
        println("Станция назначения: $station")
        println("Время поздки: $time")
        println("Дата поездки: $date")
    }
    fun Buy(answer: Int) {
        if (answer == 1) println("Покупка билета произошла успешно. Хорошей поездки!")
        else if (answer == 2) println("Покупка билета отменена. Хорошего дня!")
        else println("Ответ не распознан, покупка билета отменена. Хорошего дня!!")
    }
}