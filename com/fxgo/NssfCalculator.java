package com.fxgo;

import java.util.Scanner;

public class NssfCalculator {
    public void myNssf() {

        System.out.println();
        System.out.println("NSSF calculator");

        final double nssfRate = 0.05; // 5% nssf contribution in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Please choose what you want to Calculate:\n1.NSSF Charge\n2.NSSF Rate\n3.NetIncome after NSSF Charge\n4.GrossIncome before NSSF Charge\n5.Back to Main Menu\n ");
        int myNssfCal = (int) input.nextDouble();

        switch (myNssfCal) {
            case 1:
                System.out.println("Calculating NSSF Charge");
                System.out.print("please enter GrossIncome");
                double grossIncome = input.nextDouble();
                System.out.print("NSSF Charge is: Shs:"+ grossIncome*nssfRate);

                break;
            case 2:

                System.out.println();
                System.out.println("Calculating NSSF Rate");

                System.out.print("please enter NSSF Charge");
                double nssfCharge = input.nextDouble();
                System.out.print("please enter GrossIncome");
                double grossIncome2 = input.nextDouble();
                System.out.print("NSSF Rate is: "+ ((nssfCharge/grossIncome2)*100)+ "%");
                break;
            case 3:

                System.out.println();
                System.out.println("Calculating NetIncome after NSSF Charge");

                System.out.print("please enter GrossIncome");
                double grossIncome3 = input.nextDouble();
                System.out.print("please enter NSSF Charge");
                double nssfCharge1 = input.nextDouble();
                System.out.print("NetIncome is: Shs:"+ (grossIncome3-nssfCharge1));
                break;
            case 4:
                System.out.println();
                System.out.println("Calculating GrossIncome before NSSF Charge");

                System.out.print("please enter NSSF Charge");
                double nssfCharge2 = input.nextDouble();
                System.out.print("GrossIncome is: Shs:"+ (nssfCharge2/nssfRate));
                break;
            case 5:
                System.out.println("");
                MySimpCalOuterClass objoutermainclass= new MySimpCalOuterClass();
                objoutermainclass.mySimplecalMethod();
                break;

            default:
                System.out.println("Invalid choice please select a specific service form the menu.");
                System.exit(0);
        }

    }
}