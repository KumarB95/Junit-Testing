package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class temperaturConversion {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter temperature : ");
        float temp= utility.getFloatValue();
        System.out.println("Enter temperature Unit 1.Celsius 2.Fahrenheit : ");
        int unit= utility.getIntValue();

        if (unit==1 || unit==2){
        utility.converTemp(temp, unit);
        }else {
            System.out.println("Enter correct Unit !");
        }
    }
}
