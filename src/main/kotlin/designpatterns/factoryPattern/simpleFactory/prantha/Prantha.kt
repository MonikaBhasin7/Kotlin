package designpatterns.factoryPattern.simpleFactory.prantha

import designpatterns.factoryPattern.simpleFactory.Food

interface Prantha: Food {
    fun kneadDough()
    fun fillingTheMaterial()
    fun cookingOnTawa()
    fun serving()
}