package com.mytaxi.kata;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1,2");
        Assert.assertEquals(3, i);

    }

    @Test
    public void shouldAddNoNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("");
        Assert.assertEquals(0, i);

    }


    @Test
    public void shouldAddOneNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("3");
        Assert.assertEquals(3, i);

    }


    @Test
    public void shouldAddTenNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1,2,3,4,5,6,7,8,9,10");
        Assert.assertEquals(55, i);

    }


    @Test
    public void shouldParseCharacters() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1\n4,4,7");
        Assert.assertEquals(16, i);

    }


    @Test
    public void shouldParseNegativeNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1,4,4,-7,-1");
        Assert.assertEquals(1, i);

    }

    @Test
    public void shouldParseGreaterNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1,4,4,-7,-1,1003");
        Assert.assertEquals(1, i);

    }




}
