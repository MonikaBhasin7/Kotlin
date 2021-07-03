package designpatterns.builderPattern

fun main() {
    val jeweller = Jeweller(Ring())
    jeweller.melt()
    jeweller.cutting()
    jeweller.build()
}