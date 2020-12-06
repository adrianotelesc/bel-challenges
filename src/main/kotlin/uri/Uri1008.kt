package uri

object Uri1008 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val numFunc = readLine()?.toInt() ?: 0
        val qtdHoras = readLine()?.toInt() ?: 0
        val valorHora = readLine()?.toDouble()?: 0.0

        val salary = qtdHoras * valorHora

        println("NUMBER = $numFunc")
        println("SALARY = U$ %.2f".format(salary))
    }

}