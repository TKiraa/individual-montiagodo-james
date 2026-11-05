package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Ballpen Information Program:\n ***");
        System.out.println("Please enter the details below:\n");

        System.out.print("Enter brand: ");
        ballpen.setBrand(scanner.nextLine());

        System.out.print("Enter color: ");
        ballpen.setColor(scanner.nextLine());

        System.out.print("Enter point size: ");
        ballpen.setPointSize(scanner.nextDouble());

        System.out.print("Enter Weight in grams: ");
        ballpen.setWeightInGrams(scanner.nextDouble());

        System.out.println("\n=== Ballpen Details ===");
        System.out.println("Brand: " + ballpen.getBrand());
        System.out.println("Color: " + ballpen.getColor());
        System.out.println("Point size: " + ballpen.getPointSize());
        System.out.println("Weight in grams: " + ballpen.getWeightInGrams());

    }
}
