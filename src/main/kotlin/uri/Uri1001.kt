package uri

object Uri1001 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val a = readLine()?.toInt() ?: 0
        val b = readLine()?.toInt() ?: 0

        val sum = a + b

        println("X = $sum")
    }

}