package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1005Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("5.0", "7.1")

        Uri1005.main()

        assertOutput("MEDIA = 6.43182")
    }

    @Test
    fun `test URI sample 2`() {
        input("0.0", "7.1")

        Uri1005.main()

        assertOutput("MEDIA = 4.84091")
    }

    @Test
    fun `test URI sample 3`() {
        input("10.0", "10.0")

        Uri1005.main()

        assertOutput("MEDIA = 10.00000")
    }

}