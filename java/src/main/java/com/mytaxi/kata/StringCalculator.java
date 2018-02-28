package com.mytaxi.kata;

public class StringCalculator {

    public int calculate(String valueAsString) {

        int tempValue = 0;
        String separator = ",";
        for (int i = 0; i <= valueAsString.length(); i++) {

            if (String.valueOf(valueAsString.charAt(i)) != separator) {
                int addition = Integer.valueOf(valueAsString.charAt(i));
                tempValue+=addition;
            }
        }

        return tempValue;
    }
}
