package designpatterns.structural.state

class Food() {

    lateinit var foodState : FoodState

    constructor(foodState: FoodState) : this() {
        this.foodState = foodState
    }

    fun changeFoodState(newFoodState: FoodState) {
        foodState = newFoodState
    }
}