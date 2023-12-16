@file:OptIn(ExperimentalRoborazziApi::class, InternalRoborazziApi::class)

package app.tsumuchan.playground

import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.InternalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziContext
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@RunWith(RobolectricTestRunner::class)
class RoboTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Before
    fun setup() {
        // RoborazziContext.setRuleOverrideOutputDirectory("screenshots")
    }

    @Test
    fun test() {
        composeRule.setContent {
            Greeting(name = "Robo")
        }

        composeRule
            .onNode(hasText("Hello Robo!"))
            .assertExists()
    }

    @Test
    fun roborazziTest() {
        composeRule.setContent {
            Greeting(name = "screenshotbot")
        }

        composeRule
            .onNode(hasText("Hello screenshotbot!"))
            .captureRoboImage()
    }
}
