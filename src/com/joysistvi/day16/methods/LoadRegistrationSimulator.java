package com.joysistvi.day16.methods;

import java.util.Scanner;

public class LoadRegistrationSimulator {

    static Scanner scanner = new Scanner(System.in);
    static boolean running = true;

    public static void main(String[] args) {
        dialUssdCode();
    }

    public static void dialUssdCode() {

        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine().trim();

            if (ussdCode.equals("*143#")) {
                promptMainMenu();
                return;
            } else {
                attempts--;
                System.out.println("Invalid USSD Code!");

                if (attempts > 0) {
                    System.out.println("\nAttempts remaining: " + attempts);
                }
            }
        }

        System.out.println("\nToo many invalid attempts. Exiting...");
    }

    public static void promptMainMenu() {

        while (running) {
            System.out.println();
            System.out.println("        * Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] Go");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] ALLNET");
            System.out.println("    [0] Exit");

            int mainChoice = getInput("Enter a choice: ");

            switch (mainChoice) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> System.out.println("GoEXTRA is currently unavailable.");
                case 4 -> System.out.println("UNLI 5G is currently unavailable.");
                case 5 -> System.out.println("ALLNET is currently unavailable.");
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goPlusPromo() {

        while (running) {
            System.out.println("\n       *** Go+ Promos ***");
            System.out.println("    [1] Go+99");
            System.out.println("    [2] Go+129");
            System.out.println("    [3] Go+149");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goPlusChoice = getInput("Enter a choice: ");

            switch (goPlusChoice) {
                case 1 -> promoDetailsMenu("Go+99", 8, 8);
                case 2 -> promoDetailsMenu("Go+129", 16, 16);
                case 3 -> promoDetailsMenu("Go+149", 32, 32);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void goPromo() {

        while (running) {
            System.out.println("\n        *** Go Promos ***");
            System.out.println("    [1] Go50");
            System.out.println("    [2] Go90");
            System.out.println("    [3] Go120");
            System.out.println("    [4] Back");
            System.out.println("    [0] Exit");

            int goChoice = getInput("Enter a choice: ");

            switch (goChoice) {
                case 1 -> promoDetailsMenu("Go50", 5, 3);
                case 2 -> promoDetailsMenu("Go90", 8, 5);
                case 3 -> promoDetailsMenu("Go120", 12, 8);
                case 4 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void promoDetailsMenu(String promoName, int gb, int freeGB) {

        while (running) {
            System.out.println("\n        *** " + promoName + " Promo ***");
            System.out.println("-> Get " + gb + " GB for all sites + " + freeGB + " GB.");
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Back");
            System.out.println("    [0] Exit");

            int actionChoice = getInput("Enter a choice: ");

            switch (actionChoice) {
                case 1 -> {
                    System.out.println("You have successfully subscribed to " + promoName + "!");
                    return;
                }
                case 2 -> {
                    return;
                }
                case 0 -> exitMethod();
                default -> System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void exitMethod() {

        while (running) {
            System.out.println("\nAre you sure that you want to exit the program?");
            System.out.println("[Y] Yes - Exit Program");
            System.out.println("[N] No - Return to Main Menu");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Exiting...");
                running = false;
                return;
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Returning Back to Main Menu");
                return;
            } else {
                System.out.println("Invalid Input. Please enter Y or N.");
            }
        }
    }

    public static int getInput(String prompt) {

        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }
}