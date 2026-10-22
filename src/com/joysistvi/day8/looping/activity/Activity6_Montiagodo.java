package com.joysistvi.day8.looping.activity;

import java.util.Scanner;

public class Activity6_Montiagodo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want to display: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
