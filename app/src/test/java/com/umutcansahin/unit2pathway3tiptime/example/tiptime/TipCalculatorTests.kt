package com.umutcansahin.unit2pathway3tiptime.example.tiptime

import com.umutcansahin.unit2pathway3tiptime.calculateTip
import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "₺2,00"
        val actualTip =  calculateTip(amount = amount, tipPercent = tipPercent,false)
        assertEquals(expectedTip,actualTip)
    }
}