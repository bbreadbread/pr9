package Train

open class Train(var stationN: String, var stationP: String, var stationK: String, var time: String, var date: String) {
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
}