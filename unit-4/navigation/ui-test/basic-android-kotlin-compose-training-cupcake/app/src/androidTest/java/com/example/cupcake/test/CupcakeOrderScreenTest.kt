package com.example.cupcake.test

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.cupcake.ui.SelectOptionScreen
import org.junit.Rule
import org.junit.Test

@get:Rule
val composeTestRule2 = createAndroidComposeRule<ComponentActivity>()

class CupcakeOrderScreenTest {

    @Test
    fun selectOptionScreen_verifyContent() {
        val flavors = listOf("Vanilla", "Chocolate", "Hazelnut", "Cookie", "Mango")
        val subtotal = "$100"

        composeTestRule2.setContent {
            SelectOptionScreen(subtotal = subtotal, options = flavors)
        }

        flavors.forEach { flavor ->
            composeTestRule2.onNodeWithText(flavor).assertIsDisplayed()
        }

        composeTestRule2.onNodeWithText(
            composeTestRule2.activity.getString(
                com.example.cupcake.R.string.subtotal_price,
                subtotal
            )
        ).assertIsDisplayed()

        composeTestRule.onNodeWithStringId(com.example.cupcake.R.string.next).assertIsNotEnabled()
    }
}