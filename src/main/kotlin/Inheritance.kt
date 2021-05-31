open class Person(val name: String, val age: Int) {

}

open class YoungPerson() {
    lateinit var name : String
    constructor(name: String) : this() {
        this.name = name
    }
}


class Footballer(name: String, age: Int, val club: String, val totalGoals: Int) : Person(name, age) {
    init {
        println("name - $name")
    }
}

class Biking : YoungPerson {
    var topSpeed: Int = -1
    constructor(name: String, topSpeed: Int) : super(name) {
        this.topSpeed = topSpeed
        println("Biker Name - ${this.name} , Top Speed - ${this.topSpeed}")
    }
}

fun main() {
    //println(Footballer("Monika", 22, "Real Madrid", 10).club)
    Biking("Monika", 102)
}