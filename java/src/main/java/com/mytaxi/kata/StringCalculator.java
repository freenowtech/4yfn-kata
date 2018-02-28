package com.mytaxi.kata;

public class StringCalculator
{

    public int calculate(String valueAsString) {

        if (valueAsString.isEmpty())
                return 0;



        if (valueAsString.endsWith("\n"))
            return -1;

        String[] numeros =valueAsString.split(",");
        int len= numeros.length;
        int i = 0;
        int res =0;
        while (i<len)
        {

            res = res + Integer.parseInt(numeros[i]);
            i++;
        }

        return res;


    }
}
