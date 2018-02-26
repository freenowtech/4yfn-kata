package com.mytaxi.kata;

import java.util.Arrays;

public class StringCalculator
{

    public int calculate(String valueAsString) {

        return 0;
    }

    int add(String numbers) {
        try {
            if ("".equals(numbers)) {
                return 0;
            }
            int[] numbersArray = Arrays.asList(numbers.split(","))
                    .stream()
                    .map(String::trim)
                    .mapToInt(Integer::parseInt).toArray();
            if (numbersArray.length > 2) throw new Exception();
            if (numbersArray.length == 1) {
                return numbersArray[0];
            }
            else return numbersArray[0] + numbersArray[1];

        } catch (Exception e) {
            System.out.print(e.fillInStackTrace());
        }
        return 0;
    }
}
