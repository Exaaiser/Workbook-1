package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose Portion");
        String string = keyboard.nextLine();
        double regular = 5.45;
        double large = 8.95;
        double price = 0;

        if (string.equals("large")) {
            System.out.println("Large Sandwich is 8.95");
            price = large;
        if (string.equals("regular")) {
            System.out.println("Regular Sandwich is 5.45");
            price = regular;
        }

    System.out.println("Whats your age?");
    int age = keyboard.nextInt();

    if (age <= 17) {
        System.out.println("Senior, you qualify the discount");
    price *= 0.9;
    } else if (age >= 65) {
        System.out.println("You qualify for a senior discount!");
        price *= 0.80;
    }
            System.out.println("Total price after discount: " + price);
        }
    } }