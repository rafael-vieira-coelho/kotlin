fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3)     // 1

    val natural = shuffled.sorted()          // 2

    val inverted = shuffled.sortedBy { -it } // 3

    println(shuffled)
    println(natural)
    println(inverted)
}