package com.mytaxi.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

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

    @Test
    public void shouldAddAnyNumbers()
    {
        StringBuilder builder = new StringBuilder("");
        int accum = 0;
        Random rNumberElements = new Random();
        Random rNumber = new Random();

        int numberElements = rNumberElements.nextInt(200);
        int number;

        for (int i = 0 ; i < numberElements ; i++) {
            number = rNumber.nextInt();
            builder.append(number);
            builder.append(',');
            accum += number;
        }
        builder.deleteCharAt(builder.length()-1);

        Assert.assertEquals(accum, stringCalculator.calculate(builder.toString()));
    }

    @Test
    public void shouldAddNumbersWithNewlines()
    {
        Assert.assertEquals(0, stringCalculator.calculate(""));
        Assert.assertEquals(1, stringCalculator.calculate("1"));
        Assert.assertEquals(3, stringCalculator.calculate("1,2"));
        Assert.assertEquals(15, stringCalculator.calculate("1,2,\n3,4\n,\n5"));
    }
}
