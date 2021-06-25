package Abstract

abstract class Country(private val religion: String) {

    fun prayingGodProcess() {
        println("$religion Fold your hands and pray to God")
    }

    abstract fun foodPreparingProcess()

    abstract fun communicatingProcess()
}