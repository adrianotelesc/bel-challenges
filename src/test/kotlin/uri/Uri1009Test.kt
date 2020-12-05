package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1009Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("JOAO", "500.00", "1230.30")

        Uri1009.main()

        assertOutput("TOTAL = R$ 684.55")
    }

    @Test
    fun `test URI sample 2`() {
        input("PEDRO", "700.00", "0.00")

        Uri1009.main()

        assertOutput("TOTAL = R$ 700.00")
    }

    @Test
    fun `test URI sample 3`() {
        input("MANGOJATA", "1700.00", "1230.50")

        Uri1009.main()

        assertOutput("TOTAL = R$ 1884.58")
    }