package app.tsumuchan.playground.model

import org.junit.Assert
import org.junit.Test

class SomeClassTest {

    @Test
    fun totalSize() {
        val someClass = SomeClass(freeSize = 1, premiumSize = 2)

        Assert.assertEquals(3, someClass.totalSize)
    }
}
