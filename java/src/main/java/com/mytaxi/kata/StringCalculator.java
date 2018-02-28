package com.mytaxi.kata;

public class StringCalculator
{

    public int calculate(String valueAsString) {
        int res = 0;
        valueAsString.replace('\n', ',');
            String[] numbers = valueAsString.split(",");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].length() > 0)
                    res += Integer.valueOf(numbers[i]);
            }

        return res;
    }
}
