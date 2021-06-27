package designpatterns.factoryPattern.simpleFactory

import designpatterns.factoryPattern.simpleFactory.rice.CurdRice
import designpatterns.factoryPattern.simpleFactory.rice.FriedRice
import designpatterns.factoryPattern.simpleFactory.rice.Rice

interface FoodStore {

    fun getFoodObject(type: String): Food {
        val rice = makeFood(type)
        rice?.removingUnwantedParticles()
        rice?.washing()
        rice?.straining()
        rice?.straining()
        rice?.tadka()
        rice?.cooking()
        rice?.garnishing()
        rice?.serving()
    }
    fun makeFood(type: String): Rice?
}

class RiceStore() : FoodStore {
    override fun makeFood(type: String) : Rice? {
        if(type.equals("CurdRice", true)) {
            return CurdRice()
        } else if(type.equals("FriedRice", true)) {
            return FriedRice()
        }
        return null
    }

}