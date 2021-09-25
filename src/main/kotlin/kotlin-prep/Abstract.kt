package `kotlin-prep`

fun main() {
    var food: Food = RajmaChawal(1)
    food.apply {
        prepare()
        garnishing()
        serve()
    }
    food = Khichdi(1)
    food.apply {
        prepare()
        garnishing()
        serve()
    }
}

abstract class Food(var salt: Int) {
    init {
        println("constructor of Food abstract Food class.")
    }
    abstract fun prepare()
    fun serve() {
        println("served in plate.")
        println("heatFlame  - $heatFlame")
    }
    open fun garnishing() {
        println("Add Tomato over it.")
    }
    companion object {
        var heatFlame = 1000
    }
}

class RajmaChawal(private var salty: Int): Food(salty) {

    init {
        println("constructor of RajmaChawal class.")
    }
    override fun prepare() {
        println("preparation of Rajma Chawal")
        println(super.salt + 1)
        heatFlame = 1200
    }

    override fun garnishing() {
        super.garnishing()
        println("add raw rajma chawal over it.")
    }
}

class Khichdi(private var salty: Int): Food(salty) {

    init {
        println("constructor of Kichdi class.")
    }
    override fun prepare() {
        println("preparation of Khichdi")
        println(super.salt + 1)
        //heatFlame = 1300
    }

    override fun garnishing() {
        super.garnishing()
        println("add raw Khichdi over it.")
    }
}

/**
 * Questions -
 * 1. If we can't make instance of abstract class, then why we have constructor and init block in abstract class.
 */