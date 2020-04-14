
data class Person(val name: String = "")

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    val p = Person()

    if (p.name != "")
        throw IllegalArgumentException("Name required 1")
    else
        fail("Name required 2")
}