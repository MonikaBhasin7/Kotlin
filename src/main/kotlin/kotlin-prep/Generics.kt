package `kotlin-prep`

fun main() {
    show(listOf(1,2 ,3))
    show(listOf("a", "b","c"))
}

fun<T> show(list: List<T>) {
    println(list)
}
