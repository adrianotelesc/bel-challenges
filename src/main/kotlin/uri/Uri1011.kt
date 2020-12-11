package uri

object Uri1011 {

    @JvmStatic
    fun main(args: Array<String>? = null) {

        val pi = 3.14159
        val radius = readLine()!!.toDouble()

        val volume = (4/3.0) * pi * radius * radius * radius

        println("VOLUME = %.3f".format(volume))
    }

}