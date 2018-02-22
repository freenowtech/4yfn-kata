package com.mytaxi.kata

import org.junit.Test
import kotlin.test.assertEquals

class StringCalculatorTest {

    @Test
    fun `should add two numbers`() {

        // given
        val firstNumber = 1
        val secondNumber = 2

        // when
        val result = firstNumber + secondNumber

        // then
        assertEquals(result, 1 + 2, "Numbers should be equal")
    }
}

