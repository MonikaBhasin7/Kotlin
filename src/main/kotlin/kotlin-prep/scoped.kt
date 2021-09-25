package `kotlin-prep`

fun main() {

    /**
     * apply function takes lambda with receivers in argument.
     *          public inline fun <T> T.apply(block: T.() -> Unit): T
     *              -> T.() - It means the function () is called by the object of class 'T' and 'T' is generic with whose object we are calling
     *                        the apply function
     */
    Scoped().apply {
        a = 10
        b = 30
    }

    /**
     *  the lambda function takes 'T' class object as an argument and 'let' function is also called by the object of 'T' class.
     *  public inline fun <T, R> T.let(block: (T) -> R): R {
     *      'let' function will return value whatever 'block' lambda function returns.
     *      return block(this)
     *  }
     */
    Scoped().let { it ->
        return@let it.a
    }

    /**
     * the lambda function is called by the object of 'T' class. and 'run' function is also called by 'T' class object.
     * public inline fun <T, R> T.run(block: T.() -> R): R {
     *  the 'run' function will return whatever 'block' function will return.
     *  return block()
     * }
     */
    Scoped().run {
        a = 40
        return@run a
    }

    /**
     * first parameter = object of class 'T'
     * second parameter = lambda function which is called by the object of class 'T'
     * public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
     *      'with' function will return whatever 'block' lambda function has returned.
     *      return receiver.block()
     * }
     */
    with(Scoped()) {
        a = 50
        return@with a
    }

    /**
     * lambda function takes object of class 'T' as an argument. 'also' function return the 'T' class object from whom it has been called.
     * public inline fun <T> T.also(block: (T) -> Unit): T {
     *   block(this)
     *   return this
     * }
     */
    val scoped = Scoped().also {
        it.a = 60
    }
}

class Scoped() {
    var a = 10
    var b = 20
}