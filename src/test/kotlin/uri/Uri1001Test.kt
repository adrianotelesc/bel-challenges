package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1001Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("10", "9")

        Uri1001.main()

        assertOutput("X = 19")
    }

    @Test
    fun `test URI sample 2`() {
        input("-10", "4")

        Uri1001.main()

        assertOutput("X = -6")
    }

    @Test
    fun `test URI sample 3`() {
        input("15", "-7")

        Uri1001.main()

        assertOutput("X = 8")
    }

}