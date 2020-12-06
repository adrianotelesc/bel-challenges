fun main(args: Array<String>) {
    var codeOfProduct1 = 0
    var numberOfUnitsOfProduct1 = 0
    var priceForOneUnitOfProduct1 = 0.0
    var codeOfProduct2 = 0
    var numberOfUnitsOfProduct2 = 0
    var priceForOneUnitOfProduct2 = 0.0
    var amountToBePaid = 0.0
    var firstLine = listOf<String>()
    var secondLine = listOf<String>()

    firstLine = readLine()!!.split(' ')

    codeOfProduct1 = firstLine[0]!!.toInt()
    numberOfUnitsOfProduct1 = firstLine[1]!!.toInt()
    priceForOneUnitOfProduct1 = firstLine[2]!!.toDouble()

    secondLine = readLine()!!.split(' ')

    codeOfProduct2 = secondLine[0]!!.toInt()
    numberOfUnitsOfProduct2 = secondLine[1]!!.toInt()
    priceForOneUnitOfProduct2 = secondLine[2]!!.toDouble()

    amountToBePaid = (numberOfUnitsOfProduct1 * priceForOneUnitOfProduct1) + (numberOfUnitsOfProduct2 * priceForOneUnitOfProduct2)
    println("VALOR A PAGAR: R$ %.2f".format(amountToBePaid))

}