package com.mytaxi.kata;

public class StringCalculator
{

    public int calculate(String valueAsString) {
        int res = 0;
        if (valueAsString.length() > 0) {
            String[] numbers = valueAsString.split(",");
            for (int i = 0; i < numbers.length; i++) {
                res += Integer.valueOf(numbers[i]);
            }
        }
        return res;
    }
}
