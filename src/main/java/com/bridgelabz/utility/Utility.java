package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
    Scanner scanner;
    public Utility() {
        scanner =new Scanner(System.in);
    }
    public int getIntValue(){
        return scanner.nextInt();
    }
    public float getFloatValue(){
        return scanner.nextFloat();
    }

    public void findNumberOfNotes(int amount) {
        int temp;

        temp=amount/1000;
        amount=amount-(temp*1000);
        System.out.printf("%d X 1000 = %d\n",temp,(temp*1000));

        temp=amount/500;
        amount=amount-(temp*500);
        System.out.printf("%d X 500 = %d\n",temp,(temp*500));

        temp=amount/100;
        amount=amount-(temp*100);
        System.out.printf("%d X 100 = %d\n",temp,(temp*100));

        temp=amount/50;
        amount=amount-(temp*50);
        System.out.printf("%d X 50 = %d\n",temp,(temp*50));

        temp=amount/10;
        amount=amount-(temp*10);
        System.out.printf("%d X 10 = %d\n",temp,(temp*10));

        temp=amount/5;
        amount=amount-(temp*5);
        System.out.printf("%d X 5 = %d\n",temp,(temp*5));

        temp=amount/2;
        amount=amount-(temp*2);
        System.out.printf("%d X 2 = %d\n",temp,(temp*2));

        temp=amount/1;
        amount=amount-(temp*1);
        System.out.printf("%d X 1 = %d\n",temp,(temp*1));
    }

    public void findDayOfWeek(int month, int day, int year) {
        double m;
        int y,dow;
        m=(month-2+12)%12;
        if (m<=2){
            year--;
        }
        y=5*(year%4)+4*(year%100)+6*(year%400);
        dow=(day+(int)(2.6*m-0.2)+y)%7;

        dayofweek(dow);
    }

    private void dayofweek(int dow) {
        switch (dow){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public void converTemp(float temp, int unit) {
        float convTemp;

            if (unit == 1) {
                convTemp = (temp * (9 / 5)) + 32;
                System.out.printf("%f Celsius to Fahrenheit if : %f", temp, convTemp);
            } else if (unit == 2) {
                convTemp = (temp - 32) * (5 / 9);
                System.out.printf("%f Fahrenheit to Celsius if : %f", temp, convTemp);
            }

    }

    public void calcMonthlyPayment(int p, float R, int y) {
        float payment;
        int n=12*y;
        float r=(R/(12*100));
        float x= (float) Math.pow((1+r),(n*(1-2)));
        payment=(p*r)/(1-x);

        System.out.println("Monthly Payment is : "+payment);
    }
}

