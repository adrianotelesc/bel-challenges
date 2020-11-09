#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import ProgramTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

internal class ${NAME} : ProgramTest() {

    @Test
    fun `test sample 1`() {
        TODO("Not yet implemented")
    }

}