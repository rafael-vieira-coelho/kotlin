fun main() {
    val str1 = """ Hello, World!""".trimMargin()
    val str2 = """ #Hello, World!""".trimMargin("#")
    val str3 = str1

    println("str1 = $str1")
    println("str2 = $str2")
    println("str3 = $str3")
    print("str1 == str2: ")
    println(str1 == str2) // Prints true
    print("str1 === str2: ")
    println(str1 === str2) // Prints false
    print("str1 === str3: ")
    println(str1 === str3) // Prints true
}