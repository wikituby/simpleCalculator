package com.fxgo;

import java.util.Scanner;

public class NssfCalculator {
    public void myNssf() {

        System.out.println();
        System.out.println("NSSF calculator");

        final double nssfRate = 0.05; // 5% nssf contribution in uganda
        Scanner input = new Scanner(System.in);
        String myString = """
                Please choose what you want to Calculate:
                1.NSSF Charge
                2.NSSF Rate
                3.NetIncome after NSSF Charge
                4.GrossIncome before NSSF Charge
                5.Back to Main Menu
                                """;
        System.out.println(myString);
        int myNssfCal = (int) input.nextDouble();

        switch (myNssfCal) {
            case 1:
                System.out.println("Calculating the A mount Deducted by NSSF ");
                System.out.print("please enter your GrossIncome");
                double grossIncome = input.nextDouble();
                System.out.print("A mount Deducted by NSSF is: Shs:" + grossIncome * nssfRate);

                System.out.println("");
                Back backobj4 = new Back();
                backobj4.myBackMethod();

                break;
            case 2:

                System.out.println();
                System.out.println("Calculating NSSF Rate");

                System.out.print("please enter the A mount Deducted by NSSF");
                double nssfCharge = input.nextDouble();
                System.out.print("please enter your GrossIncome");
                double grossIncome2 = input.nextDouble();
                System.out.print("NSSF Rate is: " + ((nssfCharge / grossIncome2) * 100) + "%");
                System.out.println("");
                Back backobj3 = new Back();
                backobj3.myBackMethod();
                break;
            case 3:

                System.out.println();
                System.out.println("Calculating NetIncome after Paying NSSF");

                System.out.print("please enter GrossIncome");
                double grossIncome3 = input.nextDouble();
                System.out.print("please enter the A mount Deducted by NSSF");
                double nssfCharge1 = input.nextDouble();
                System.out.print("Your NetIncome is: Shs:" + (grossIncome3 - nssfCharge1));
                System.out.println("");
                Back backobj = new Back();
                backobj.myBackMethod();
                break;
            case 4:
                System.out.println();
                System.out.println("Calculating GrossIncome before NSSF Charge");

                System.out.print("please enter the A mount Deducted by NSSF");
                double nssfCharge2 = input.nextDouble();
                System.out.print("Your GrossIncome is: Shs:" + (nssfCharge2 / nssfRate));
                System.out.println("");
                Back backobj2 = new Back();
                backobj2.myBackMethod();
                break;
            case 5:
                System.out.println("");
                MySimpCalOuterClass objoutermainclass = new MySimpCalOuterClass();
                objoutermainclass.mySimplecalMethod();
                break;

            default:
                System.out.println("Invalid choice please select a specific service form the menu.");
                System.out.println("");
                Back backobj1 = new Back();
                backobj1.myBackMethod();
        }

    }
}