package uri

import java.lang.Math.abs

object Uri1013 {
    @JvmStatic
    fun main(args: Array<String>? = null) {
        var a = 0
        var b = 0
        var c = 0
        var maiorAB = 0
        var maiorABC = 0

        var numbers = readLine()!!.split(' ')

        a = numbers[0]!!.toInt()
        b = numbers[1]!!.toInt()
        c = numbers[2]!!.toInt()

        maiorAB = (a + b + abs(a - b))/2

        maiorABC = (maiorAB + c + abs(maiorAB - c))/2

        println("$maiorABC eh o maior")
    }
}