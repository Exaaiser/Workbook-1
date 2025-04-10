package com.pluralsight;

import java.awt.*;

public class MathApp {// Question 1:
    public static void main(String[] args) {
        int bobSalary = 15;
        int garySalary = 22;

        int highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary " + highestSalary);

        int carPrice = 2;
        int truckPrice = 6;

        int cheaperPrice = Math.min(carPrice, truckPrice);

        System.out.println("The cheaper one " + cheaperPrice);

        double yaricap = 7.25;
        double alan = Math.PI * yaricap * yaricap;

        System.out.println(" Radius is " + yaricap + " Radius circle " + alan);

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("Number:" + number);
        System.out.println("Square Root is " + squareRoot);

        Point x1 = new Point(5,10);
        Point y1 = new Point(85,50);

        double distance = x1.distance(y1);

        System.out.println("Distance Betwenn Point " + distance);

        double value = -3.8;
        double corrrectValue = Math.abs(value);

        System.out.println("Absolute value of " + value + " is " + corrrectValue);

        double randomNumber = Math.random();
        System.out.println(randomNumber);
    }
}



