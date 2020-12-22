package uri

object Uri1015 {

    @JvmStatic
    fun main(args: Array<String>) {
        var x1 = 0.0
        var y1 = 0.0
        var x2 = 0.0
        var y2 = 0.0
        var distance = 0.0
        var number = listOf<String>()

        number = readLine()!!.split(' ')
        x1 = number[0]!!.toDouble()
        y1 = number[1]!!.toDouble()

        number = readLine()!!.split(' ')
        x2 = number[0]!!.toDouble()
        y2 = number[1]!!.toDouble()

        distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))

        println("%.4f".format(distance))

    }

}