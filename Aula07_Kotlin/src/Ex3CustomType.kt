data class MyDate (val dia: Int, val mes: Int, val ano: Int) : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int {
        return dia.compareTo(other.dia) + mes.compareTo(other.mes) + ano.compareTo(other.ano)
    }
    
}