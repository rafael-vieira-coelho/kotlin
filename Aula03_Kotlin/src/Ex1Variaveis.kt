fun main() {
    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3

    var e: Int = 3  // 1
    println(e)  // 2

    val d: Int  // 1

    if (e == 1) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }
    println(d) // 3
}