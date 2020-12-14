package uri

object Uri1014 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val totalDistanceTraveled = readLine()!!.toInt()
        val totalSpentFuel = readLine()!!.toDouble()

        val consumption = totalDistanceTraveled / totalSpentFuel

        println("%.3f km / l".format(consumption))
    }

}