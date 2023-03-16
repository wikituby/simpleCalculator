package com.fxgo;

import java.util.Scanner;

public class NssfCalculator {
    public void myNssf() {

        System.out.println();
        System.out.println("NSSF calculator");

        final double nssfRate = 0.05; // 5% nssf contribution in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Please choose what you want to Calculate:\n1.NSSF Charge\n2.NSSF Rate\n3.NetIncome after NSSF Charge\n4.GrossIncome before NSSF Charge\n5.Back to Main Menu\n ");
        double myNssfCal = input.nextDouble();

        if(myNssfCal==1){
            System.out.println();
            System.out.println("Calculating NSSF Charge");
            System.out.print("please enter GrossIncome");
            double grossIncome = input.nextDouble();
            System.out.print("NSSF Charge is: Shs:"+ grossIncome*nssfRate);


        } else if (myNssfCal==2) {
            System.out.println();
            System.out.println("Calculating NSSF Rate");

            System.out.print("please enter NSSF Charge");
            double nssfCharge = input.nextDouble();
            System.out.print("please enter GrossIncome");
            double grossIncome = input.nextDouble();
            System.out.print("NSSF Rate is: "+ (nssfCharge/grossIncome)+ "%");


        } else if (myNssfCal==3) {

            System.out.println();
            System.out.println("Calculating NetIncome after NSSF Charge");

            System.out.print("please enter GrossIncome");
            double grossIncome = input.nextDouble();
            System.out.print("please enter NSSF Charge");
            double nssfCharge = input.nextDouble();
            System.out.print("NetIncome is: Shs:"+ (grossIncome-nssfCharge));


        } else if (myNssfCal==4) {

            System.out.println();
            System.out.println("Calculating GrossIncome before NSSF Charge");

            System.out.print("please enter NSSF Charge");
            double nssfCharge = input.nextDouble();
            System.out.print("GrossIncome is: Shs:"+ (nssfCharge/nssfRate));


        } else if (myNssfCal==5) {
            MySimpCalOuterClass objoutermainclass= new MySimpCalOuterClass();
            objoutermainclass.mySimplecalMethod();
        }


        //System.out.println("NSSF Contribution per month shs: " + nssfRate * salary);
        //System.out.println("Net Income to be paid as salary shs: " + (salary - (nssfRate * salary)));
    }
}