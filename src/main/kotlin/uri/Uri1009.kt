package uri

object Uri1009 {

    @JvmStatic
    fun main(args: Array<String>? = null) {
        val nomeVendedor = readLine()
        val salario = readLine()!!.toDouble()
        val totalVendas = readLine()!!.toDouble()

        val total = (salario + totalVendas * 0.15)

        println("TOTAL = R$ %.2f".format(total))
    }

}