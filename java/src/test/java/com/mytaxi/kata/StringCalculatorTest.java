package com.mytaxi.kata;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest
{

    @Test
    public void shouldAddTwoNumbers()
    {
        StringCalculator stringCalculator = new StringCalculator();
        // given

        String voidString = "";
        String a = "1";
        String b = "1,2";
        //when

        String resultVoid = "0";
        String resultA = "1";
        String resultB = "3";

        //then

        assertEquals(stringCalculator.add(voidString, resultVoid));
        assertEquals(stringCalculator.add(a, resultA));
        assertEquals(stringCalculator.add(b, resultB));
    }

}
