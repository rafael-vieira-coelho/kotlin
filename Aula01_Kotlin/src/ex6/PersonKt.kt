package ex6

data class Person2(val name: String, val age: Int)

fun main() {
    val p = Person2("Joe", 67)
    println(p.name)
}