import TrainI as Train
import Train.Train as Customer

fun main() {
    try {
        var Tr = Train("","","", "","","")
        println("КАССА")
        Tr.GetInfoTrain()

        var Cu = Customer(Tr.station,"","")
        println("ПОКУПАТЕЛЬ")
        Cu.GetInfoOrder()

        println("КАССА")
        Tr.OutInfoTrain()

        println("ПОКУПАТЕЛЬ")
        Cu.OutInfoOrder()

        var gg = Tr.Customer(Cu.station,Cu.time,Cu.date)
        println(gg)
        if (gg != "Нужного маршрута не найдено!") {
            println("Подтверждаете выбор? 1 - да , 2 - нет.")
            val answer = readLine()!!.toInt()
            Cu.Buy(answer)
        }
    }
    catch (e:Exception){
        println("Неверный формат ввода данных")
    }
}