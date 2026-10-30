package com.joysistvi.day14.math;

import java.util.Scanner;

public class Activity11_Montiagodo {

    public static void main(String[] args) {

        // 1. Math.abs()
        // Gets the absolute value of a number.
        System.out.println("Absolute Value: " + Math.abs(-2)); // 2

        // 2. Math.max()
        // Gets the highest value between two numbers.
        System.out.println("Maximum: " + Math.max(2, 5)); // 5

        // 3. Math.min()
        // Gets the lowest value between two numbers.
        System.out.println("Minimum: " + Math.min(2, 5)); // 2

        // 4. Math.pow()
        // Raises the first number to the power of the second number.
        System.out.println("Power: " + Math.pow(2, 3)); // 2³ (2 * 2 * 2 ) = 8

        // 5. Math.sqrt()
        // Gets the square root of a number.
        System.out.println("Square Root: " + Math.sqrt(25)); // 5.0

        // 6. Math.round()
        // Rounds a decimal to the nearest whole number.
        System.out.println("Round: " + Math.round(2.6)); // 3

        // 7. Math.ceil()
        // Rounds a decimal up to the next whole number.
        System.out.println("Ceiling: " + Math.ceil(3.5)); // 4.0

        // 8. Math.floor()
        // Rounds a decimal down to the previous whole number.
        System.out.println("Floor: " + Math.floor(5.7)); // 5.0

        // 9. Math.random()
        // Generates a random number from 0.0 to less than 1.0.
        System.out.println("Random: " + Math.random()); // 0.9741336758405521

        // 10. Math.log()
        // Gets the natural logarithm of a number.
        System.out.println("Natural Log: " + Math.log(5)); // 1.6094379124341003

        // 11. Math.log10()
        // Gets the logarithm with base 10.
        System.out.println("Log Base 10: " + Math.log10(100)); // 2.0

        // 12. Math.exp()
        // Calculates e raised to the given power.
        System.out.println("Exponential: " + Math.exp(2)); // 7.38905609893065

        // 13. Math.sin()
        // Gets the sine of an angle in radians.
        System.out.println("Sine: " + Math.sin(Math.toRadians(20))); // 0.3420201433256687

        // 14. Math.cos()
        // Gets the cosine of an angle in radians.
        System.out.println("Cosine: " + Math.cos(Math.toRadians(30))); // 0.8660254037844387

        // 15. Math.tan()
        // Gets the tangent of an angle in radians.
        System.out.println("Tangent: " + Math.tan(Math.toRadians(35))); // 0.7002075382097097



        // Presentation Phase
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Presentation Phase ---");

        System.out.println("Method: Math.abs()\n" +
                           "Explanation: Gets the absolute value of a number.\n" +
                           "It converts a negative number into a positive number.");

        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nOriginal number: " + number);
        System.out.println("Absolute Value: " + Math.abs(number));

        scanner.close();
    }
}
