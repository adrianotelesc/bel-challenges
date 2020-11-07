package uri

object Uri1002 {

    private const val PI = 3.14159

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val radius = readLine()?.toDouble() ?: 0.0

        val area = PI * radius * radius

        println("A=%.4f".format(area))
    }

}