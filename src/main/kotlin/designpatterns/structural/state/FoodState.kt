package designpatterns.structural.state

interface FoodState {
    fun doWork()
    fun previous()
    fun next()
    fun doWorkAgain()
}