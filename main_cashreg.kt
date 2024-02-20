import TrainI as Customer
import Train.Train as Train

fun main() {
    try {
        var Tr = Train("","","", "","")
        println("КАССА")
        Tr.GetInfoTrain()

        var Cu = Customer("","","","","","")
        println("ПОКУПАТЕЛЬ")
        Cu.GetInfoOrder()
        Cu.GetInfoTrain()

        println("КАССА")
        Cu.Train1()

        println("ПОКУПАТЕЛЬ")
        Cu.OutInfoOrder()

        var gg = Cu.Customer()
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