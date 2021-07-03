package designpatterns.creational.factoryPattern.prantha

import designpatterns.creational.factoryPattern.Food

interface Prantha: Food {
    fun kneadDough()
    fun fillingTheMaterial()
    fun cookingOnTawa()
    fun serving()
}