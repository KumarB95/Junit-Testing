package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;

public class vendingMachine {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter amount : ");
        int amount=utility.getIntValue();

        utility.findNumberOfNotes(amount);
    }
}
