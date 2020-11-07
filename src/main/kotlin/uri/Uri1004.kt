package uri

object Uri1004 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val a = readLine()?.toInt() ?: 0
        val b = readLine()?.toInt() ?: 0

        val product = a * b

        println("PROD = $product")
    }

}