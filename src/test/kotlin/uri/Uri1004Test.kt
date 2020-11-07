package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1004Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("3", "9")

        Uri1004.main()

        assertOutput("PROD = 27")
    }

    @Test
    fun `test URI sample 2`() {
        input("-30", "10")

        Uri1004.main()

        assertOutput("PROD = -300")
    }

    @Test
    fun `test URI sample 3`() {
        input("0", "9")

        Uri1004.main()

        assertOutput("PROD = 0")
    }

}