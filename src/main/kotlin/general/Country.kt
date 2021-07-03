import kotlin.properties.Delegates

//here 'name' is parameter
class Country(name: String) {

    var name: String
    var population : Int = 0

    init {
        this.name = name
        println("Name of the country is $name")
    }

    constructor(name: String, population: Int) : this(name) {
        this.population = population
        println("Population of $name is $population")
    }
}

//here 'name' is property
class City(val name: String) {
}

fun main() {

    //Primary Constructor
    //val country = Country("India")

    //Secondary Constructor Invocation
    val newCountry = Country("South Africa", 1000)

//    val city = City("Kapurthala")
//    println("Name of the city is ${city.name}")
}