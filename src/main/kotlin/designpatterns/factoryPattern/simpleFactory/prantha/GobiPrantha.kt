package designpatterns.factoryPattern.simpleFactory.prantha

import designpatterns.factoryPattern.simpleFactory.Food

class GobiPrantha: Prantha, Food {

    override fun kneadDough() {
        println("GobiPrantha kneadDough")
    }

    override fun fillingTheMaterial() {
        println("GobiPrantha fillingTheMaterial")
    }

    override fun cookingOnTawa() {
        println("GobiPrantha fillingTheMaterial")
    }

    override fun serving() {
        println("GobiPrantha fillingTheMaterial")
    }
}