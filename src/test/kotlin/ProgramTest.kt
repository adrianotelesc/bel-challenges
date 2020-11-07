import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class ProgramTest {

    private val standardOut = System.out
    private val standardIn = System.`in`

    private val outStream = ByteArrayOutputStream()

    private val output: String get() = outStream.toString().trim()

    fun input(vararg args: String) {
        val input = buildString { args.forEach { appendLine(it) } }
        val inStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inStream)
    }

    fun assertOutput(expected: String) {
        assertEquals(expected, output)
    }

    @BeforeAll
    open fun setUp() {
        System.setOut(PrintStream(outStream))
    }

    @AfterEach
    fun reset() {
        outStream.reset()
    }

    @AfterAll
    open fun tearDown() {
        System.setIn(standardIn)
        System.setOut(standardOut)
    }

}