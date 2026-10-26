package com.joysistvi.day11.singledarray;

import java.util.Scanner;

public class Activity8_Montiagodo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) +  ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nYou entered:");
        int sum = 0;
        int i = 0;
        int highest = numbers[i];
        int lowest = numbers[i];

        for (int number : numbers) {
            sum =  sum + number; {
                System.out.println("Index " + (i + 1) + ": " + number);
                i++;

                if(number > highest) {
                    highest = number;
                }
                if(number < lowest) {
                    lowest = number;
                }
            }
        }
        double average = (sum / numbers.length);
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}
