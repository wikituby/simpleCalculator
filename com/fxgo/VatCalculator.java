package com.fxgo;

import java.util.Scanner;

public class VatCalculator {
    public void myVat() {
        final double VAT_CHARGE = 0.18; // 18% VAT rate
        Scanner input = new Scanner(System.in);

        System.out.print("VAT Calculator:\n1.Calculate VAT Amount to be paid\n2.Calculate total cost of the goods and VAT\n3.Calculate VAT Rate\n4.Back to Main Menu ");
        int x = (int) input.nextDouble();

        switch (x){
            case 1:
                System.out.println("");
                System.out.println("Calculate VAT Amount to be paid");

                System.out.println("Enter the price of the goods");
                double priceOfGoods = input.nextDouble();
                double vatAmount = priceOfGoods*VAT_CHARGE;
                System.out.print("VAT Amount to be paid is: Shs:"+vatAmount);
                break;
            case 2:
                System.out.println("");
                System.out.println("Calculate total cost of the goods plus VAT");

                System.out.println("Enter the price of the goods");
                double priceOfGoods2 = input.nextDouble();
                System.out.print("Enter the VAT Amount");
                double vatAmount2 = input.nextDouble();
                double totalCost = (priceOfGoods2+vatAmount2);
                System.out.print("Total cost of the goods plus VAT to be paid is: Shs:"+totalCost);
                break;
            case 3:
                System.out.println("");
                System.out.println("Calculate VAT Rate");

                System.out.println("Enter the VAT Amount");
                double vatAmount3 = input.nextDouble();
                System.out.print("Enter the price of the goods");
                double priceOfGoods3 = input.nextDouble();
                double vatRate = (vatAmount3/priceOfGoods3);
                System.out.print("VAT Rate is: "+vatRate*100+"%");
                break;
            case 4:
                System.out.println("");
                MySimpCalOuterClass objoutermainclass= new MySimpCalOuterClass();
                objoutermainclass.mySimplecalMethod();
                break;

        }

    }


}