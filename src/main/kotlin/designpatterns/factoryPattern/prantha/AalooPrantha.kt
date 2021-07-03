package designpatterns.factoryPattern.prantha

import designpatterns.factoryPattern.Food

class AalooPrantha: Prantha, Food {
    override fun kneadDough() {
        println("AalooPrantha kneadDough")
    }

    override fun fillingTheMaterial() {
        println("AalooPrantha fillingTheMaterial")
    }

    override fun cookingOnTawa() {
        println("AalooPrantha fillingTheMaterial")
    }

    override fun serving() {
        println("AalooPrantha fillingTheMaterial")
    }
}