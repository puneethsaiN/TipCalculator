package com.example.tipcalculator

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalcTest {
    @Test
    fun calcTipTest_20Percent_noRoundUp() {
        val billAmount = 100.0
        val tipPercent = 20.0

        val expectedResult = NumberFormat.getCurrencyInstance().format(20)

        val actualResult = calculateTip(
            amount = billAmount,
            tipPercent = tipPercent,
            checkInput = false,
        )

        assertEquals(expectedResult, actualResult)

    }
}