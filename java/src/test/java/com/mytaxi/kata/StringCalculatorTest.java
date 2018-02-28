package com.mytaxi.kata;

import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest
{

    private StringCalculator stringCalculator;


    @Test
    public void shouldADD0numb()
    {
        stringCalculator = new StringCalculator();

        Assert.assertEquals(0,stringCalculator.calculate(""));
        // given

        //when

        //then
    }

    @Test
    public void shouldAdd1Numbers()
    {
        stringCalculator = new StringCalculator();

        Assert.assertEquals(12,stringCalculator.calculate("12"));
        // given

        //when

        //then
    }

    @Test
    public void shouldAddTwoNumbers()
    {
        stringCalculator = new StringCalculator();

        Assert.assertEquals(3,stringCalculator.calculate("1,2"));
        // given

        //when

        //then
    }
    @Test
    public void shouldAddNnumbers()
    {
        stringCalculator = new StringCalculator();

        Assert.assertEquals(55,stringCalculator.calculate("1,2,3,4,5,6,7,8,9,10"));
        // given

        //when

        //then
    }
    @Test
    public void shouldAddNqwithjumpanumbers()
    {
        stringCalculator = new StringCalculator();

        Assert.assertEquals(11,stringCalculator.calculate("1\n"));
        // given

        //when

        //then
    }

}
