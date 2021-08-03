package higherorder


val square: (Int) -> Int = { value -> value * value }
fun main() {
    println(square(10))

    //first way
    calculate(fun(data: Int): Int {
        return data* data
    })
    //second way
    calculate { data -> data * data }
}

fun calculate(action: (Int) -> Int) {
    println(action(20))
}
