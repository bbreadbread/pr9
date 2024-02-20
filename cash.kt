import Train.*

class TrainI(var station: String,  time: String,  date: String, stationN: String, stationP: String, stationK: String): Train(stationN,stationP,stationK,time,date){
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

    fun Train1() {
        println("Список поездов: ")
        for (bb in 0..massivSN.size-1) {
            println("Начальная станция: ${massivSN[i]}")
            println("Промежуточная станция: ${massivSP[i]}")
            println("Конечная станция: ${massivSK[i]}")
            println("Дата отправления: ${massivDate[i]}")
            println("Время отправления: ${massivTime[i]}")
            println()
        }
    }
    fun Customer():String{
        if (station == massivSN[0])
        {
            if (time == massivTime[0])
            {
                if (date == massivDate[0])
                {
                    return ("Найденный поезд по запросу: ${massivSN[0]}, ${massivTime[0]}, ${massivDate[0]}, 902 Р.")
                }
            }
        }
        else if (station == massivSN[1])
        {
            if (time == massivTime[1])
            {
                if (date == massivDate[1])
                {
                    return("Найденный поезд по запросу: ${massivSN[1]}, ${massivTime[1]}, ${massivDate[1]},  500 Р.")
                }
            }
        }
        else if (station == massivSN[2])
        {
            if (time == massivTime[2])
            {
                if (date == massivDate[2])
                {
                    return("Найденный поезд по запросу: ${massivSN[2]}, ${massivTime[2]}, ${massivDate[2]},  902 Р.")
                }
            }
        }
        else if (station == massivSN[3])
        {
            if (time == massivTime[3])
            {
                if (date == massivDate[3])
                {
                    return("Найденный поезд по запросу: ${massivSN[3]}, ${massivTime[3]}, ${massivDate[3]},  1376 Р.")
                }
            }
        }
        return("Нужного маршрута не найдено!")
    }
}