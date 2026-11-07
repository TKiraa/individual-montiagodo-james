package com.joysistvi.day21.activity;

import java.util.Scanner;

public class Activity14_Montiagodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** User Registration ***\n" +
                           "Please enter the details below:\n");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        // Password validation
        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();

            if (UserAccount.isEmpty(password)) {
                System.out.println("Error: Password cannot be empty.");
            } else if (!UserAccount.isValidPassword(password)) {
                System.out.println("Error: Invalid password!");
                System.out.println("Password must contain:");
                System.out.println("- At least 8 characters");
                System.out.println("- One uppercase letter");
                System.out.println("- One lowercase letter");
                System.out.println("- One number");
                System.out.println("- One special character");
            } else {
                break;
            }
        }

        // Create object using parameterized constructor
        UserAccount userAccount = new UserAccount(
                firstName, middleName, lastName, address, email, password
        );

        System.out.println("\n--- Account Details ---");
        System.out.println(userAccount);

    }
}
