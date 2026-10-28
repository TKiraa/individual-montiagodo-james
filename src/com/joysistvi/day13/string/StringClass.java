package com.joysistvi.day13.string;

import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {
        // Login Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Login ***");

        int retries = 0;

    while (retries < 5) {

        String correctUsername =  "admin";
        String correctPassword = "admin123";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validation
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty.\n");
            retries++;
        }
        // Authentication
        else if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successfully!");
            System.out.println("Welcome, " + username + "!");
            break;
        } else {
            System.out.println("Invalid Username or Password.");
            System.out.println("Access Denied.\n");
            retries++;
        }
    }
    if (retries == 5)
        System.out.println("Maximum attempts reached.");
        // 5 retries

    }
}

/*
// Exit
        System.out.println("Are you sure that you really wanna exit?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");
        // +
        System.out.println("\nEnter your choice: ");
        String choice = String.valueOf(scanner.nextLine().charAt(0));

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Returning Back to Main Menu");
        }

 */


/*

        `charAt()

    String word = "Hello"; // String literal

    System.out.println(word.charAt(4));

    String middleName = "Bulawit"; // String literal

    char middleInitial = middleName.charAt(0);
    System.out.println(middleInitial);


    length()

    String word = "Hello"; // String literal

    System.out.println(word.length());


    toUpperCase() toLowerCase()

    String word = "Hello"; // String literal

    System.out.println(word.toUpperCase());
 */