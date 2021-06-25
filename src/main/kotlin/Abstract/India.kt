package Abstract

class India: Country("Indian") {

    override fun foodPreparingProcess() {
        println("Make the food in the clay pots.")
    }

    override fun communicatingProcess() {
        println("speak Hindi language")
    }
}