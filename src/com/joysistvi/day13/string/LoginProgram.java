package com.joysistvi.day13.string;

import java.util.Scanner;

public class LoginProgram {

    public static void main(String[] args) {
        // Login Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Login ***");
        final int MAX_ATTEMPs = 5;

        boolean isLoggenIn = false;

        for (int attemp = 0; attemp < MAX_ATTEMPs; attemp++) {
        String correctUsername =  "admin";
        String correctPassword = "admin123";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validation
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty.\n");
            continue; // skip the current iteration
        }
        // Authentication
         if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successfully!");
            System.out.println("Welcome, " + username + "!");
            isLoggenIn = true;
            break;
        } else {
            System.out.println("Invalid Username or Password.");
            System.out.println("Access Denied.\n");

        }
    }
        if (!isLoggenIn) {
            System.out.println("Too many field attempts. Account locked.");
        }

        scanner.close();

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