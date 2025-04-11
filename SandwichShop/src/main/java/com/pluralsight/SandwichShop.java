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
        String sandwichSize = "";

        if (string.equals("large")) {
            System.out.println("Large Sandwich is 8.95");
            price = large;
            sandwichSize = "Large";
        if (string.equals("regular")) {
            System.out.println("Regular Sandwich is 5.45");
            price = regular;
            sandwichSize = "Regular";
        }

            System.out.println("Would you like the sandwich 'loaded' (YES/no)?");
            System.out.println("- Regular: $1.00");
            System.out.println("- Large: $1.75");
            String loadedInput = keyboard.nextLine();
            if (loadedInput.equals("YES")) {
                if (sandwichSize.equals("Regular")) {
                    price += 1.00; // Regular için $1.00 ekle
                    System.out.println("Added $1.00 for a loaded Regular sandwich.");
                } else if (sandwichSize.equals("Large")) {
                    price += 1.75; // Large için $1.75 ekle
                    System.out.println("Added $1.75 for a loaded Large sandwich.");
                }
            } else {
                System.out.println("No additional cost for a non-loaded sandwich.");
            }


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
    }