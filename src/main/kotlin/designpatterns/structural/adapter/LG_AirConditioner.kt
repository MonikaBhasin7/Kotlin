package designpatterns.structural.adapter

class LG_AirConditioner: AirConditioner {
    override fun suckAllHeatFromRoom() {
        println("LG_AirConditioner suckAllHeatFromRoom")
    }

    override fun giveCoolAir() {
        println("LG_AirConditioner giveCoolAir")
    }
}