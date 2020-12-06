package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1008Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("25", "100", "5.50")

        Uri1008.main()

        assertOutput("NUMBER = 25\nSALARY = U$ 550.00")
    }

    @Test
    fun `test URI sample 2`() {
        input("1", "200", "20.50")

        Uri1008.main()

        assertOutput("NUMBER = 1\nSALARY = U$ 4100.00")
    }

    @Test
    fun `test URI sample 3`() {
        input("6", "145", "15.55")

        Uri1008.main()

        assertOutput("NUMBER = 6\nSALARY = U$ 2254.75")
    }

}