package designpatterns.factoryPattern.prantha

import designpatterns.factoryPattern.Food

interface Prantha: Food {
    fun kneadDough()
    fun fillingTheMaterial()
    fun cookingOnTawa()
    fun serving()
}