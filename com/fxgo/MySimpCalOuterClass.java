package com.fxgo;

import java.util.Scanner;

public class MySimpCalOuterClass {
    public void mySimplecalMethod() {
        int simpleCal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your Simple Calculator");
        System.out.println("1.Calculate VAT\n2.Calculate NSSF\n3.Calculate Loan");
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
        }

    }

}