fun main(args: Array<String>) {
    var codPeca1 = 0
    var numPeca1 = 0
    var valorPeca1 = 0.0
    var codPeca2 = 0
    var numPeca2 = 0
    var valorPeca2 = 0.0
    var calc = 0.0
    var numeros = listOf<String>()

    numeros = readLine()!!.split(' ')

    codPeca1 = numeros[0]!!.toInt()
    numPeca1 = numeros[1]!!.toInt()
    valorPeca1 = numeros[2]!!.toDouble()

    codPeca2 = numeros[3]!!.toInt()
    numPeca2 = numeros[4]!!.toInt()
    valorPeca2 = numeros[5]!!.toDouble()

    calc = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2)
    println("VALOR A PAGAR: R$ %.2f".format(calc))

}