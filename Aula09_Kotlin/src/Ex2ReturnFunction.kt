fun operation2(): (Int) -> Int { //1
    return ::square
}

fun square(x: Int) = x * x      //2

fun main() {
    val func = operation2()     //3

    println(func(square(2))) //4
}