package com.fxgo;

import java.util.Scanner;

public class VatCalculator {
    public void myVat() {
        final double VAT_CHARGE = 0.18; // 18% VAT rate in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the goods to be supplied in ugx: ");
        double price = input.nextDouble();

        double vatAmount = price * VAT_CHARGE;
        double totalPrice = price + vatAmount;

        System.out.println("VAT shs: " + vatAmount);
        System.out.println("Total price to be paid: shs: " + totalPrice);
    }


}