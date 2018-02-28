package com.mytaxi.kata;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {

    public int calculate(String valueAsString) {

        valueAsString = valueAsString.replace("\n" , ",");
        ArrayList<String> array = new ArrayList<>(Arrays.asList(valueAsString.split(",")));
        int index = 0;

        for (String num : array) {

            if (!num.isEmpty())
                if(Integer.valueOf(num)<1000)
                    index+= Integer.valueOf(num);

        }

        return index;
    }
}
