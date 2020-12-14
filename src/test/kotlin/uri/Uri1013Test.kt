package uri

import ProgramTest
import org.junit.jupiter.api.Test

internal class Uri1013Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        input("7 14 106")

        Uri1013.main()

        assertOutput("106 eh o maior")
    }

    @Test
    fun `test URI sample 2`() {
        input("217 14 6")

        Uri1013.main()

        assertOutput("217 eh o maior")
    }
}