package app.tsumuchan.playground.module1

import org.junit.Assert
import org.junit.Test

class SomeClass1Test {

    @Test
    fun totalSize() {
        val someClass1 = SomeClass1(freeSize = 1, premiumSize = 2)

        Assert.assertEquals(3, someClass1.totalSize)
    }
}
