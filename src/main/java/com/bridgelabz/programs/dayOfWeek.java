package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class dayOfWeek {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Month : ");
        int month=utility.getIntValue();
        System.out.println("Enter day : ");
        int day=utility.getIntValue();
        System.out.println("Enter year : ");
        int year=utility.getIntValue();

        utility.findDayOfWeek(month,day,year);


    }
}
