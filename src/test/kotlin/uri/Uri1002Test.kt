package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1002Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("2.00")

        Uri1002.main()

        assertOutput("A=12.5664")
    }

    @Test
    fun `test URI sample 2`() {
        input("100.64")

        Uri1002.main()

        assertOutput("A=31819.3103")
    }

    @Test
    fun `test URI sample 3`() {
        input("150.00")

        Uri1002.main()

        assertOutput("A=70685.7750")
    }

}