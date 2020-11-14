package uri

object Uri1006 {

    private const val WEIGHT_A = 2
    private const val WEIGHT_B = 3
    private const val WEIGHT_C = 5

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val a = readLine()?.toDouble() ?: 0.0
        val b = readLine()?.toDouble() ?: 0.0
        val c = readLine()?.toDouble() ?: 0.0

        val average = (a * WEIGHT_A + b * WEIGHT_B + c * WEIGHT_C) / (WEIGHT_A + WEIGHT_B + WEIGHT_C)

        println("MEDIA = %.1f".format(average))
    }

}