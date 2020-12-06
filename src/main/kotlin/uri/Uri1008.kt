package uri

object Uri1008 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val employeeNumber = readLine()?.toInt() ?: 0
        val workedHoursNumber = readLine()?.toInt() ?: 0
        val amountPerHour = readLine()?.toDouble()?: 0.0

        val salary = workedHoursNumber * amountPerHour

        println("NUMBER = $employeeNumber")
        println("SALARY = U$ %.2f".format(salary))
    }

}