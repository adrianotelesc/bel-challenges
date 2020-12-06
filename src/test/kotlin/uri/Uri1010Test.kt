package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1010Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("12 1 5.30")
        input("16 2 5.10")

        Uri1010.main()

        assertOutput("VALOR A PAGAR: R$ 15.50")
    }

    @Test
    fun `test URI sample 2`() {
        input("13 2 15.30")
        input("161 4 5.20")

        Uri1010.main()

        assertOutput("VALOR A PAGAR: R$ 51.40")
    }

    @Test
    fun `test URI sample 3`() {
        input("1 1 15.10")
        input("2 1 15.10")

        Uri1010.main()

        assertOutput("VALOR A PAGAR: R$ 30.20")
    }
}