package app.tsumuchan.playground

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RoboTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun test() {
        composeRule.setContent {
            Greeting(name = "Robo")
        }

        composeRule
            .onNode(hasText("Hello Robo!"))
            .assertExists()
    }
}