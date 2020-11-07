package uri

object Uri1005 {

    private const val WEIGHT_A = 3.5
    private const val WEIGHT_B = 7.5

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val a = readLine()?.toDouble() ?: 0.0
        val b = readLine()?.toDouble() ?: 0.0

        val average = (a * WEIGHT_A + b * WEIGHT_B) / (WEIGHT_A + WEIGHT_B)

        println("MEDIA = %.5f".format(average))
    }

}