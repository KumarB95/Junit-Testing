package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class monthlyPayment {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Loan principal amount, Rate of Interest and Loan Tenure :");
        int p= utility.getIntValue();
        float R= utility.getFloatValue();
        int y= utility.getIntValue();

        utility.calcMonthlyPayment(p,R,y);
    }
}
