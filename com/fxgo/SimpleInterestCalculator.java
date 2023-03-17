package com.fxgo;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public void mySical() {
        double fixedRate=0;
        //calculate simple interest
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Simple Interest Calculator");

        System.out.println("Please chose what to calculate\n1.simple interest to be paid per day\n2.simple interest to be paid per Week\n3.simple interest to be paid per Month\n4.simple interest to be paid per Year\n5.interest rate per Month\n6.Back to Main Menu");
        int x = Integer.parseInt(scanner.nextLine());


        switch (x) {
            case 1:
                System.out.println("");
                System.out.println("simple interest to be paid per day");

                System.out.print("please enter amount to borrow");
                double principal = Integer.parseInt(scanner.nextLine());

                System.out.print("please enter rate Per Month");
                double rateCalPerMonth = Integer.parseInt(scanner.nextLine());
                fixedRate = rateCalPerMonth;
                double rateCalPerDay = (rateCalPerMonth / 100)/30;

                System.out.print("simple interest to be paid per day: Shs:"+ principal*rateCalPerDay);

                System.out.println("");
                Back backobj8 = new Back();
                backobj8.myBackMethod();

                break;
            case 2:
                System.out.println("");
                System.out.println("simple interest to be paid per Week");

                System.out.print("please enter principal");
                double principal1 = Integer.parseInt(scanner.nextLine());

                System.out.print("please enter rate Per Month");
                double rateCalPerMonth2 = Integer.parseInt(scanner.nextLine());
                double rateCalPerWeek = ((rateCalPerMonth2 / 100)/30)*7;

                System.out.print("simple interest to be paid per Week 1s: Shs:"+ principal1*rateCalPerWeek);

                System.out.println("");
                Back backobj6 = new Back();
                backobj6.myBackMethod();

                break;
            case 3:
                System.out.println("");
                System.out.println("simple interest paid per Month");

                System.out.print("please enter principal");
                double principal3 = Integer.parseInt(scanner.nextLine());

                System.out.print("please enter rate Per Month");
                double rateCalPerMonth4 = Integer.parseInt(scanner.nextLine());

                System.out.print("simple interest paid per day: Shs:"+ principal3*rateCalPerMonth4);
                System.out.println("");
                Back backobj5 = new Back();
                backobj5.myBackMethod();
                break;
            case 4:
                System.out.println("");
                System.out.println("simple interest paid per Year");

                System.out.print("please enter principal");
                double principal5 = Integer.parseInt(scanner.nextLine());

                System.out.print("please enter rate Per Month");
                double rateCalPerMonth5 = Integer.parseInt(scanner.nextLine());
                double rateCalPerYear = (rateCalPerMonth5/100)*12;

                System.out.print("simple interest paid per Year: Shs:"+ principal5*rateCalPerYear);
                System.out.println("");
                Back backobj4 = new Back();
                backobj4.myBackMethod();
                break;

            case 5:
                System.out.println("");
                System.out.println("interest rate per Month");

                System.out.print("please enter amount you want to take");
                double principal6 = Integer.parseInt(scanner.nextLine());

                System.out.print("please enter Simple Interest you want to Per Month");
                double simpleInterestPerMonth = Integer.parseInt(scanner.nextLine());
                double rateCalPerMonth7 = (simpleInterestPerMonth/principal6);
                System.out.print("interest rate per Month: "+ rateCalPerMonth7*100 + "%");
                System.out.println("");
                Back backobj = new Back();
                backobj.myBackMethod();

                break;

            case 6:
                System.out.println("");
                MySimpCalOuterClass objoutermainclass= new MySimpCalOuterClass();
                objoutermainclass.mySimplecalMethod();
                break;
            default:
                System.out.println("Invalid choice please select a specific service form the menu.");
                System.out.println("");
                Back backobj2 = new Back();
                backobj2.myBackMethod();
        }

    }

}