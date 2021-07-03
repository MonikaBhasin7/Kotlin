package designpatterns.factoryPattern.simpleFactory.rice

import designpatterns.factoryPattern.simpleFactory.Food

class FriedRice: Rice {

    override fun washing() {
        println("FriedRice washing.")
    }

    override fun straining() {
        println("FriedRice straining.")
    }

    override fun tadka() {
        println("FriedRice tadka.")
    }

    override fun cooking() {
        println("FriedRice cooking.")
    }

    override fun garnishing() {
        println("FriedRice garnishing.")
    }

    override fun serving() {
        println("FriedRice serving.")
    }
}