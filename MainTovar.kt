import  Tovar.Tov as NewTovar
import Customer as NewCustomer

fun main(){
    try {
        var NT = NewTovar("", 0.0, "","", 0)
        NT.GetInfoTovar()
        var NC = NewCustomer(NT.name, NT.cena, NT.edIzm,NT.vid, NT.k)
        var cena = NT.Sale()
        NC.GetInfoCustomer()
        NC.OutputCustomer()
        NC.Shop(cena)
    }
    catch (e:Exception){
        println("Неверный формат ввода данных")
    }
}