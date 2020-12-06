package uri

object Uri1008 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val employeeNumber = readLine()!!.toInt()
        val workedHoursNumber = readLine()!!.toInt()
        val amountPerHour = readLine()!!.toDouble()

        val salary = workedHoursNumber * amountPerHour

        println("NUMBER = $employeeNumber")
        println("SALARY = U$ %.2f".format(salary))
    }

}