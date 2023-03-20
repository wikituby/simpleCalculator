package com.fxgo;

import java.util.Scanner;

public class MySimpCalOuterClass {
    public void mySimplecalMethod() {
        int simpleCal;
        Scanner scanner = new Scanner(System.in);
        String myString = """
                Your Simple Calculator:
                1.Calculate VAT
                2.Calculate NSSF
                3.Calculate Loan
                                """;
        System.out.println(myString);
        simpleCal = Integer.parseInt(scanner.nextLine());

        if (simpleCal == 1) {
            //vat calculator
            VatCalculator vatobj = new VatCalculator();
            vatobj.myVat();

        } else if (simpleCal == 2) {

            // nssf calculator
            NssfCalculator nssfobj = new NssfCalculator();
            nssfobj.myNssf();
        } else if (simpleCal == 3) {

            //Simple Interest Calculator
            SimpleInterestCalculator siobj = new SimpleInterestCalculator();
            siobj.mySical();
        } else {
            System.out.println("Invalid choice please select a specific service form the menu.");
            System.out.println("");
            Back backobj1 = new Back();
            backobj1.myBackMethod();

        }

    }

}