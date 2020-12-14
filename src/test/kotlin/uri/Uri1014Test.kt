package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1014Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("500", "35.0")

        Uri1014.main()

        assertOutput("14,286 km / l")
    }

    @Test
    fun `test URI sample 2`() {
        input("2254", "124.4")

        Uri1014.main()

        assertOutput("18,119 km / l")
    }

    @Test
    fun `test URI sample 3`() {
        input("4554", "464.6")

        Uri1014.main()

        assertOutput("9,802 km / l")
    }

}