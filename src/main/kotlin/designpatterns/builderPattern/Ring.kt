package designpatterns.builderPattern

class Ring : GoldMakingProcess {

    override fun melt() {
        println("Gold melt for ring")
    }

    override fun cutting() {
        println("Gold cutting for ring")
    }

    override fun making() {
        println("Gold making for ring")
    }

    override fun shaping() {
        println("Gold shaping for ring")
    }

    override fun finishing() {
        println("Gold finishing for ring")
    }

    override fun polishing() {
        println("Gold polishing for ring")
    }
}