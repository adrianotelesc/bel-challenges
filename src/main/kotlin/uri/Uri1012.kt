package uri

object Uri1012 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        var a = 0.0
        var b = 0.0
        var c = 0.0
        val pi = 3.14159


       var number = readLine()!!.split(' ')

        a = number[0]!!.toDouble()
        b = number[1]!!.toDouble()
        c = number[2]!!.toDouble()

        var triangle = a * c/2
        var circle = pi * c * c
        var trapezio = (a + b)/2 * c
        var square = b * b
        var rectangle = a * b

        println("TRIANGLE: %.3f".format(triangle))
        println("CIRCLE: %.3f".format(circle))
        println("TRAPEZIO: %.3f".format(trapezio))
        println("SQUARE: %.3f".format(square))
        println("RECTANGLE: %.3f".format(rectangle))
    }

}