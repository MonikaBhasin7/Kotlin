package designpatterns.structural.state

class FoodCleaningState: FoodState {

    lateinit var food : Food

//    constructor( food: Food): this() {
//        this.food = food
//    }



    override fun doWork() {
        println("Clean the vegetables")
    }

    override fun previous() {
        TODO("Not yet implemented")
    }

    override fun next() {
        TODO("Not yet implemented")
    }

    override fun doWorkAgain() {
        TODO("Not yet implemented")
    }
}