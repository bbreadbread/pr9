import Train.*

class TrainI(var station:String, var stationN: String, var stationP: String, var stationK: String, var time: String, var date: String){
    var i = 0;
    var massivSN:Array<String> = arrayOf("", "", "", "")
    val massivSP:Array<String> = arrayOf("", "", "", "")
    val massivSK:Array<String> = arrayOf("", "", "", "")
    val massivTime:Array<String> = arrayOf("", "", "", "")
    val massivDate:Array<String>  = arrayOf("", "", "", "")
    fun GetInfoTrain() {

        while (i < 4) {
            println("Начальная станция:")
            stationN = readLine()!!.toString()

            println("Промежуточная станция:")
            stationP = readLine()!!.toString()

            println("Конечная станция:")
            stationK = readLine()!!.toString()

            println("Время поездки:")
            time = readLine()!!.toString()

            println("Дата поездки:")
            date = readLine()!!.toString()

            massivSN[i] = stationN
            massivSP[i] = stationP
            massivSK[i] = stationK
            massivTime[i] = time
            massivDate[i] = date

            i++
        }

    }

    fun OutInfoTrain(){
        println("Список поездов: ")
        i = 0
        while (i < 4) {
            println("Начальная станция:" + massivSN[i])
            println("Промежуточная станция:" + massivSP[i])
            println("Конечная станция:" + massivSK[i])
            println("Время поездки:" + massivTime[i])
            println("Дата поездки:" + massivDate[i])
            println()
            i++
        }
    }

    /*fun Train1() {
        println("Список поездов: ")
        for (bb in 0..massivSN.size-1) {
            println("Начальная станция: ${massivSN[i]}")
            println("Промежуточная станция: ${massivSP[i]}")
            println("Конечная станция: ${massivSK[i]}")
            println("Дата отправления: ${massivDate[i]}")
            println("Время отправления: ${massivTime[i]}")
            println()
        }
    }*/
    fun Customer(station: String, time: String, date: String):String{
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