package com.mytaxi.kata;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1,2");
        System.out.println(i);
        Assert.assertEquals(3, i);

    }

    @Test
    public void shouldAddNoNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("");
        System.out.println(i);
        Assert.assertEquals(0, i);

    }


    @Test
    public void shouldAddOneNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("3");
        System.out.println(i);
        Assert.assertEquals(3, i);

    }


    @Test
    public void shouldAddTenNumbers() {


        StringCalculator sc = new StringCalculator();
        int i = sc.calculate("1,2,3,4,5,6,7,8,9,10");
        System.out.println(i);
        Assert.assertEquals(55, i);

    }

}
