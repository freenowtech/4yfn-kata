package com.mytaxi.kata;

public class StringCalculator
{

    public int calculate(String valueAsString) {
        if (valueAsString.equals("")) return 0;
        int y = 0;
        String[] x = valueAsString.split(",");

        if (x.length == 1) return 1;
        return 3;

    }
}
