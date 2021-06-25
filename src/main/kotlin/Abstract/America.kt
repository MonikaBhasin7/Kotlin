package Abstract

class America: Country("American") {

    override fun foodPreparingProcess() {
        println("make food in non stick utensils.")
    }

    override fun communicatingProcess() {
        println("speak american english.")
    }
}