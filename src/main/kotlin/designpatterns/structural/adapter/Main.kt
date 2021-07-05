package designpatterns.structural.adapter

fun main() {
    var lg_ac = LG_AirConditioner()
    var cooler : Cooler = CoolerAdapter(lg_ac)
    cooler.giveCoolAir()
    cooler.showerWaterInsideTheRoom()

    
}