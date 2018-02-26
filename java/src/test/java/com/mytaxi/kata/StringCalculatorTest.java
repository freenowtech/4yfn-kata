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

        int resultVoid = 0;
        int resultA = 1;
        int resultB = 3;

        //then

        assertEquals(stringCalculator.add(voidString), resultVoid);
        assertEquals(stringCalculator.add(a), resultA);
        assertEquals(stringCalculator.add(b), resultB);
    }

}
