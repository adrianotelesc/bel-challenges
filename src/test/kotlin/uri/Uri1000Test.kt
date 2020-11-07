package uri

import ProgramTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class Uri1000Test : ProgramTest() {

    @Test
    fun `test URI sample 1`() {
        Uri1000.main()

        assertOutput("Hello World!")
    }

}