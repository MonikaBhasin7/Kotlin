package designpatterns.factoryPattern.rice

import designpatterns.factoryPattern.Food

interface Rice: Food {

    //non-abstract because removing unwanted particles from the rice will be same for varities of rice, it will be common, no need
    //write it again and again in every Rice class.
    fun removingUnwantedParticles() {
        println("Remove unwanted particles in rice.")
    }
    fun washing()
    fun straining()
    fun tadka()
    fun cooking()
    fun garnishing()
    fun serving()
}