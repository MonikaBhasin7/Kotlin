package designpatterns.structural.adapter

class CoolerAdapter(val ac: AirConditioner): Cooler {

    override fun giveCoolAir() {
        println("AC will giveCoolAir")
    }

    override fun showerWaterInsideTheRoom() {
        println("AC will showerWaterInsideTheRoom")
    }
}