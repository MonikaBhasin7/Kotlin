package designpatterns.factoryPattern

import designpatterns.factoryPattern.prantha.AalooPrantha
import designpatterns.factoryPattern.prantha.GobiPrantha
import designpatterns.factoryPattern.prantha.Prantha
import designpatterns.factoryPattern.rice.CurdRice
import designpatterns.factoryPattern.rice.FriedRice
import designpatterns.factoryPattern.rice.Rice

interface FoodStore {

    fun getFoodObject(type: String): Food
}

class RiceStore() : FoodStore {
    override fun getFoodObject(type: String): Food {
        val rice = makeFood(type)
        rice?.removingUnwantedParticles()
        rice?.washing()
        rice?.straining()
        rice?.straining()
        rice?.tadka()
        rice?.cooking()
        rice?.garnishing()
        rice?.serving()
        return rice as Food
    }

    private fun makeFood(type: String) : Rice? {
        if(type.equals("CurdRice", true)) {
            return CurdRice()
        } else if(type.equals("FriedRice", true)) {
            return FriedRice()
        }
        return null
    }

}

class PranthaStore() : FoodStore {
    override fun getFoodObject(type: String): Food {
        val prantha = makeFood(type)
        prantha?.kneadDough()
        prantha?.fillingTheMaterial()
        prantha?.cookingOnTawa()
        prantha?.serving()
        return prantha as Food
    }

    private fun makeFood(type: String) : Prantha? {
        if(type.equals("GobiPrantha", true)) {
            return GobiPrantha()
        } else if(type.equals("AalooPrantha", true)) {
            return AalooPrantha()
        }
        return null
    }

}