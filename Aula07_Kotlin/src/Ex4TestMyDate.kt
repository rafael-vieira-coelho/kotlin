fun main() {
    val data1: MyDate = MyDate(10, 8, 1980)
    val data2: MyDate = MyDate(10, 8, 2020)

    if (data1 < data2) {
        println("10/8/1980 vem antes de 10/8/2020")
    } else {
        println("10/8/1980 não vem antes de 10/8/2020")
    }
}