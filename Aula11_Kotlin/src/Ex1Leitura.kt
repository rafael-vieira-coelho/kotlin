fun main(args: Array<String>) {
    println("Informe dois valores separados por um espaço:")
    var (a, b) = readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).

    println("Maior valor entre $a e $b é ${maxNum(a.toInt(), b.toInt())}")
}

fun maxNum(a: Int, b: Int): Int {
    return if (a > b) a else b
}