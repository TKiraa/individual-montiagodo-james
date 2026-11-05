package com.joysistvi.day20.activity;

import java.util.Scanner;

public class Activity13_Montiagodo {

    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************************\n" +
                           "*     User Account Registration     *\n" +
                           "*************************************");

        System.out.print("Enter First Name: ");
        userAccount.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        userAccount.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        userAccount.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        userAccount.setAddress(scanner.nextLine());

        // Email validation
        String email;
        while (true) {
            System.out.print("Enter Email: ");
            email = scanner.nextLine();

            if (UserAccount.isEmpty(email)) {
                System.out.println("Error: Email cannot be empty.");
            } else if (!UserAccount.isValidEmail(email)) {
                System.out.println("Error: Invalid email format. Please try again.");
            } else {
                break;
            }
        }
        userAccount.setEmail(email);

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
        userAccount.setPassword(password);

        System.out.println("\n--- User Account Created ---");
        System.out.println("Full Name: " + userAccount.getFirstName() +
                           " " + userAccount.getMiddleName() +
                           " " + userAccount.getLastName());
        System.out.println("Address: " + userAccount.getAddress());
        System.out.println("Email: " + userAccount.getEmail());

    }
}
