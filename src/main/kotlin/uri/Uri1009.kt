package uri

object Uri1009 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        readLine()
        val salary = readLine()!!.toDouble()
        val salesTotal = readLine()!!.toDouble()

        val totalSalary = (salary + salesTotal * 0.15)

        println("TOTAL = R$ %.2f".format(totalSalary))
    }

}