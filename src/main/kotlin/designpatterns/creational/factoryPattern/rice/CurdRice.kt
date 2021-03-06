package designpatterns.creational.factoryPattern.rice

class CurdRice: Rice {

    override fun washing() {
        println("CurdRice washing.")
    }

    override fun straining() {
        println("CurdRice straining.")
    }

    override fun tadka() {
        println("CurdRice tadka.")
    }

    override fun cooking() {
        println("CurdRice cooking.")
    }

    override fun garnishing() {
        println("CurdRice garnishing.")
    }

    override fun serving() {
        println("CurdRice serving.")
    }
}