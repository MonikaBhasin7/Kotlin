package designpatterns.builderPattern

class Jeweller(private val gold: GoldMakingProcess): GoldMakingProcess {

    override fun melt() {
        gold.melt()
    }

    override fun cutting() {
        gold.cutting()
    }

    override fun making() {
        gold.making()
    }

    override fun shaping() {
        gold.shaping()
    }

    override fun finishing() {
        gold.finishing()
    }

    override fun polishing() {
        gold.polishing()
    }

    fun build(): GoldMakingProcess {
        return gold
    }

}