package com.mytaxi.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest
{

    public StringCalculator stringCalculator;

    @Before
    public void init() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void shouldAddTwoNumbers()
    {
        Assert.assertEquals(0, stringCalculator.calculate(""));
        Assert.assertEquals(1, stringCalculator.calculate("1"));
        Assert.assertEquals(3, stringCalculator.calculate("1,2"));
    }

}
