package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1007Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("5", "6", "7", "8")

        Uri1007.main()

        assertOutput("DIFERENCA = -26")
    }

    @Test
    fun `test URI sample 2`() {
        input("0", "0", "7", "8")

        Uri1007.main()

        assertOutput("DIFERENCA = -56")
    }

    @Test
    fun `test URI sample 3`() {
        input("5", "6", "-7", "8")

        Uri1007.main()

        assertOutput("DIFERENCA = 86")
    }

}