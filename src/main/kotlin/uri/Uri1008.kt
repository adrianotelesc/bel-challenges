package uri

object Uri1008 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val num_func = readLine()?.toInt() ?: 0
        val qtd_horas = readLine()?.toInt() ?: 0
        val valor_hora = readLine()?.toDouble()?: 0.0

        val salary = qtd_horas * valor_hora

        println("NUMBER = $num_func")
        println("SALARY = U$ %.2f".format(salary))
    }

}