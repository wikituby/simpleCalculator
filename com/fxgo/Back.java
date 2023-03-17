package com.fxgo;

import java.util.Scanner;

public class Back {
    public void myBackMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0.Back to Main Menu");
        int simpleCal = Integer.parseInt(scanner.nextLine());

        if(simpleCal==0){
            MySimpCalOuterClass objoutermainclass = new MySimpCalOuterClass();
            objoutermainclass.mySimplecalMethod();

        }


    }

}
