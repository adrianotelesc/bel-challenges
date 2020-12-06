package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1006Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("5.0", "6.0", "7.0")

        Uri1006.main()

        assertOutput("MEDIA = 6.3")
    }

    @Test
    fun `test URI sample 2`() {
        input("5.0", "10.0", "10.0")

        Uri1006.main()

        assertOutput("MEDIA = 9.0")
    }

    @Test
    fun `test URI sample 3`() {
        input("10.0", "10.0", "5.0")

        Uri1006.main()

        assertOutput("MEDIA = 7.5")
    }

}