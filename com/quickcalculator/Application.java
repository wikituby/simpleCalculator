package com.quickcalculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("********** QUICK CALCULATOR **********");
        displayHomeMenu();
    }

    private static void displayHomeMenu() {
        String homeView = """
                1. VAT Calculator
                2. NSSF Calculator
                3. Loan Calculator
                4. Exit
                """;

        System.out.println("\n" + homeView);

        Scanner menuInput = new Scanner(System.in);
        int menuOption = menuInput.nextInt();

        switch (menuOption) {
            case 1 -> calculateVAT();
            case 2 -> calculateNSSF();
            case 3 -> calculateLoan();
            case 4 -> System.out.println("Thank you!");
            default -> throw new IllegalArgumentException("Unexpected value: " + menuOption);
        }

    }

    private static void calculateVAT() {
        VATCalculator calculator = new VATCalculator();

        String vatView = """

                VAT Calculator
                1. Calculate Net Amount
                2. Calculate Gross Amount
                3. Calculate Rate Used
                """;

        System.out.println(vatView);

        Scanner menuInput = new Scanner(System.in);
        int vatOption = menuInput.nextInt();

        switch (vatOption) {
            case 1 -> {
                System.out.print("\nEnter gross amount: ");
                double grossAmount = menuInput.nextDouble();
                calculator.setGrossAmount(grossAmount);

                calculator.calculateNetAmount();
            }
            case 2 -> {
                System.out.print("\nEnter net amount: ");
                double netAmount = menuInput.nextDouble();
                calculator.setNetAmount(netAmount);

                calculator.calculateGrossAmount();
            }
            case 3 -> {
                System.out.print("\nEnter gross amount: ");
                double grossAmount = menuInput.nextDouble();
                calculator.setGrossAmount(grossAmount);

                System.out.print("\nEnter net amount: ");
                double netAmount = menuInput.nextDouble();
                calculator.setNetAmount(netAmount);

                calculator.calculateRate();
            }
            default -> throw new IllegalArgumentException("Unexpected VAT option: " + vatOption);
        }

        String output = String.format("%s %-15.2f %s %-15.2f %s %-15.2f %s %-15.2f", "Amount: ", calculator
                        .getGrossAmount(), "VAT%: ", calculator.getRate() * 100,
                "VAT: ", calculator.getVat(), "Net Amount: ", calculator.getNetAmount());

        System.out.println(output);

        displayHomeMenu();
    }

    private static void calculateNSSF() {
        NSSFCalculator calculator = new NSSFCalculator();

        String nssfView = """

                NSSF Calculator
                1. Calculate Net Amount
                2. Calculate Gross Amount
                3. Calculate Rate Used
                4. Calculate NSSF

                """;

        System.out.println(nssfView);

        Scanner menuInput = new Scanner(System.in);
        int nssfOption = menuInput.nextInt();

        switch (nssfOption) {
            case 1 -> {
                System.out.print("\nEnter gross amount: ");
                double grossAmount = menuInput.nextDouble();
                calculator.setGrossAmount(grossAmount);

                calculator.calculateNetAmount();

            }
            case 2 -> {
                System.out.print("\nEnter net amount: ");
                double netAmount = menuInput.nextDouble();
                calculator.setNetAmount(netAmount);

                calculator.calculateGrossAmount();
            }
            case 3 -> {
                System.out.print("\nEnter gross amount: ");
                double grossAmount = menuInput.nextDouble();
                calculator.setGrossAmount(grossAmount);

                System.out.print("\nEnter net amount: ");
                double netAmount = menuInput.nextDouble();
                calculator.setNetAmount(netAmount);

                calculator.calculateRate();
            }
            default -> throw new IllegalArgumentException("Unexpected NSSF option: " + nssfOption);
        }

        String output = String.format("%s %-15.2f %s %-15.2f %s %-15.2f %s %-15.2f", "Amount: ", calculator
                        .getGrossAmount(), "NSSF%: ", calculator.getRate() * 100,
                "NSSF: ", calculator.getNssf(), "Net Amount: ", calculator.getNetAmount());

        System.out.println(output);

        displayHomeMenu();
    }

    private static void calculateLoan() {
        LOANCalculator calculator = new LOANCalculator();

        String loanView = """

                Simple Interest Calculator
                1.interest to be paid per Month
                2.interest to be paid per day
                3.interest to be paid per Week
                4.interest to be paid per Year
                5.Amount to be Borrowed
                6.Interest rate per month

                """;

        System.out.println(loanView);

        Scanner menuInput = new Scanner(System.in);
        int loanOption = menuInput.nextInt();

        switch (loanOption) {
            case 1 -> {
                System.out.print("\nEnter amount to be Borrowed: ");
                double amountToBeBorrowed = menuInput.nextDouble();
                calculator.setAmountToBeBorrowed(amountToBeBorrowed);

                System.out.print("\nEnter interest rate per month: ");
                double ratePerMonth = menuInput.nextDouble();
                calculator.setRatePerMonth(ratePerMonth);

                calculator.calculateInterestToBePaidPerMonth();
                System.out.println("1.interest paid per Month is shs:" + calculator.getInterestToBePaidPerMonth()+" "+" interest paid per day is shs:" + calculator.getInterestToBePaidPerDay()+" "+"  interest paid per Week is shs:" + calculator.getInterestToBePaidPerWeek()+" "+"  interest paid per Year is shs:" + calculator.getInterestToBePaidPerYear());



            }
            case 2 -> {
                System.out.print("\nEnter amount to be Borrowed: ");
                double amountToBeBorrowed = menuInput.nextDouble();
                calculator.setAmountToBeBorrowed(amountToBeBorrowed);

                System.out.print("\nEnter interest rate per month: ");
                double ratePerMonth = menuInput.nextDouble();
                calculator.setRatePerMonth(ratePerMonth);

                calculator.calculateInterestToBePaidPerDay();
                System.out.println("1.interest paid per Day is shs:" + calculator.getInterestToBePaidPerDay()+" "+" interest paid per Month is shs:" + calculator.getInterestToBePaidPerMonth()+" "+"  interest paid per Week is shs:" + calculator.getInterestToBePaidPerWeek());

            }
            case 3 -> {
                System.out.print("\nEnter amount to be Borrowed: ");
                double amountToBeBorrowed = menuInput.nextDouble();
                calculator.setAmountToBeBorrowed(amountToBeBorrowed);

                System.out.print("\nEnter interest rate per month: ");
                double ratePerMonth = menuInput.nextDouble();
                calculator.setRatePerMonth(ratePerMonth);

                calculator.calculateInterestToBePaidPerWeek();
                System.out.println("1.interest paid per Week is shs:" + calculator.getInterestToBePaidPerWeek()+" "+" interest paid per day is shs:" + calculator.getInterestToBePaidPerDay()+" "+"  interest paid per Month is shs:" + calculator.getInterestToBePaidPerMonth());

            }
            case 4 -> {
                System.out.print("\nEnter amount to be Borrowed: ");
                double amountToBeBorrowed = menuInput.nextDouble();
                calculator.setAmountToBeBorrowed(amountToBeBorrowed);

                System.out.print("\nEnter interest rate per month: ");
                double ratePerMonth = menuInput.nextDouble();
                calculator.setRatePerMonth(ratePerMonth);

                calculator.calculateInterestToBePaidPerYear();
                System.out.println("1.interest paid per Year is shs:" + calculator.getInterestToBePaidPerYear()+" "+" interest paid per day is shs:" + calculator.getInterestToBePaidPerDay()+" "+"  interest paid per Week is shs:" + calculator.getInterestToBePaidPerWeek()+" "+"  interest paid per Month is shs:" + calculator.getInterestToBePaidPerMonth());

            }
            case 5 -> {
                System.out.print("\ninterest to be paid per Month: ");
                double interestToBePaidPerMonth = menuInput.nextDouble();
                calculator.setInterestToBePaidPerMonth(interestToBePaidPerMonth);

                System.out.print("\nInterest rate per month: ");
                double ratePerMonth = menuInput.nextDouble();
                calculator.setRatePerMonth(ratePerMonth);

                calculator.calculateAmountToBeBorrowed();
                System.out.println("1.Amount to be borrowed:" + calculator.getAmountToBeBorrowed()+" "+" interest paid per day is shs:" + calculator.getInterestToBePaidPerDay()+" "+"  interest paid per Week is shs:" + calculator.getInterestToBePaidPerWeek());

            }
            case 6 -> {
                System.out.print("\ninterest to be paid per Month: ");
                double interestToBePaidPerMonth = menuInput.nextDouble();
                calculator.setInterestToBePaidPerMonth(interestToBePaidPerMonth);

                System.out.print("\nEnter amount to be Borrowed: ");
                double amountToBeBorrowed = menuInput.nextDouble();
                calculator.setAmountToBeBorrowed(amountToBeBorrowed);

                calculator.calculateRatePerMonth();
                System.out.println("1.interest Rate per Month:" + calculator.getRatePerMonth());

            }
            default -> throw new IllegalArgumentException("Unexpected NSSF option: " + loanOption);
        }

        /*System.out.println("1.interest paid per Month is shs:" + calculator.getInterestToBePaidPerMonth());
        System.out.println("1.interest paid per day is shs:" + calculator.getInterestToBePaidPerDay());
        System.out.println("1.interest paid per Week is shs:" + calculator.getInterestToBePaidPerWeek());
        System.out.println("1.interest paid per Year is shs:" + calculator.getInterestToBePaidPerYear());
        System.out.println("1.Rate per Month is :" + (calculator.getRatePerMonth())*100+"%");
        System.out.println("1.Amount to be borrowed is shs:" + calculator.getAmountToBeBorrowed());
*/
        //String output = String.format("%s %-15.2f %s %-15.2f %s %-15.2f %s %-15.2f", "interest paid per Month is shs: ", calculator.getInterestToBePaidPerMonth(),
        //"interest paid daily: ", calculator.getInterestToBePaidPerDay());
        //System.out.println(output);


        displayHomeMenu();
    }

}
