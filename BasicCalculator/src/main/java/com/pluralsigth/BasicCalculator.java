package com.pluralsigth;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        int  firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();

        System.out.println("Calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Select Operation");
        String operation = scanner.next();

        double result = 0;
        int absoulteResult = firstNumber * secondNumber;


        result = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + (int)result);





     scanner.close();
    }

}
