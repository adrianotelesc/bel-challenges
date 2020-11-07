package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1003Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("30", "10")

        Uri1003.main()

        assertOutput("SOMA = 40")
    }

    @Test
    fun `test URI sample 2`() {
        input("-30", "10")

        Uri1003.main()

        assertOutput("SOMA = -20")
    }

    @Test
    fun `test URI sample 3`() {
        input("0", "0")

        Uri1003.main()

        assertOutput("SOMA = 0")
    }

}