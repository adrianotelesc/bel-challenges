package uri

object Uri1007 {

    private val A = 0
    private val B = 0
    private val C = 0
    private val D = 0

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val a = readLine()?.toInt() ?: 0
        val b = readLine()?.toInt() ?: 0
        val c = readLine()?.toInt() ?: 0
        val d = readLine()?.toInt() ?: 0

        val difference = (a * b - c * d)

        println("DIFERENCA = $difference")
    }

}