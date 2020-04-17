fun main() {
    val a1 = arrayOf(1, 2, 3) // creates an Array<Int> of size 3 containing [1, 2, 3].
    a1.forEach {x -> print("$x ") }
    println()

    val a2 = Array(3) { i -> i * 2 } // creates an Array<Int> of size 3 containing [0, 2, 4]
    a2.forEach {x -> print("$x ") }
    println()

    val a3 = arrayOfNulls<Int>(3) // creates an Array<Int?> of [null, null, null]
    a3.forEach {x -> print("$x ") }
    println()

    val doubles = doubleArrayOf(1.5, 3.0)
    println(doubles.average()) // prints 2.25

    val ints = intArrayOf(1, 4)
    println(ints.average()) // prints 2.5

    val asc = Array(5) { i -> (i * i).toString() }
    for(s in asc){
        print("$s ");
    }
}