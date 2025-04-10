package com.pluralsigth;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name");
        String string = scanner.nextLine();

        System.out.println("Enter Hours Worked");
        float secondNumber = scanner.nextFloat();

        System.out.println("Enter Your Pay rate");
        float thirdNumber = scanner.nextFloat();

        System.out.println("(Name)'s earned " + secondNumber *thirdNumber );
    }
}
