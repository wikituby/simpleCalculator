package com.fxgo;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public void mySical() {

        //calculate simple interest
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;

        System.out.println();
        System.out.println("Simple Interest Calculator");

        System.out.println("Please input the amount to lend in UGX");
        principal = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input your rate per month");
        rate = Integer.parseInt(scanner.nextLine());

        double rateCalPerMonth = rate / 100;
        double rateCalPerDay = (rateCalPerMonth) / 30;
        double rateCalPerWeek = (rateCalPerDay) * 7;
        double rateCalPerYear = (rateCalPerMonth) * 12;

        System.out.println("simple interest paid per day: " + "sh:" + principal * rateCalPerDay);
        System.out.println("simple interest paid per Week: " + "sh:" + principal * rateCalPerWeek);
        System.out.println("simple interest paid per Month: " + "sh:" + principal * rateCalPerMonth);
        System.out.println("simple interest paid per Year: " + "sh:" + principal * rateCalPerYear);
    }

}