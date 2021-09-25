package `kotlin-prep`

fun main() {

}

interface Programming {
    var code: Int //we can initialize the value here, because interfaces dont have any state.
    fun writePrintingCode()
}

class C : Programming {

    override var code: Int
        get() = 1
        set(value) {}

    override fun writePrintingCode() {
        println("cout<<")
    }
}
class Kotlin : Programming {
    override var code: Int
        get() = 10
        set(value) {}

    override fun writePrintingCode() {
        println("print()")
    }
}