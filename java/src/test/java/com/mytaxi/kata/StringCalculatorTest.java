package com.mytaxi.kata;

import org.junit.Test;
import static org.junit.Assert.*;
public class StringCalculatorTest
{

    @Test
    public void shouldAddTwoNumbers()
    {

        // given
        String x = "";
        StringCalculator result = new StringCalculator();
        //when
        int num = result.calculate(x);
        assertEquals(num, 0);
        x = "1";
        num = result.calculate(x);
        assertEquals(num, 1);
        x = "1,2";
        num = result.calculate(x);
        assertEquals(num, 3);

        //then
    }

}
