package designpatterns.structural.adapter

class LG_Cooler: Cooler {
    override fun giveCoolAir() {
        println("LG_Cooler giveCoolAir")
    }

    override fun showerWaterInsideTheRoom() {
        println("LG_Cooler showerWaterInsideTheRoom")
    }
}