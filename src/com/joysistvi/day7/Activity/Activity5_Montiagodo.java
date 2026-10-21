package com.joysistvi.day7.Activity;

import java.util.Scanner;

public class Activity5_Montiagodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ussCode;

        System.out.println("Dial *143# to access Globe Services");


        while (true) {
            System.out.print("Enter USSD Code: ");
            ussCode = scanner.nextLine();

            if (ussCode.equals("*143#")) {
                break;
            } else {
                System.out.println("Invalid USSD code. Please try again.");
            }
        }

        // Main Menu
        System.out.println("\n* Load Registration *");
        System.out.println("    [1] Go+");
        System.out.println("    [2] Go");
        System.out.println("    [3] GoEXTRA");
        System.out.println("    [4] UNLI 5G");
        System.out.println("    [5] ALLNET");
        System.out.print("Enter a choice: ");

        int mainChoice = scanner.nextInt();

        if (mainChoice < 1 || mainChoice > 5) {
            System.out.println("Invalid Choice:");
            return;
        }

        // Promo Submenus
        switch (mainChoice) {
            case 1:
                System.out.println("\n*** Go+ Promos ***");
                System.out.println("    [1] Go+99");
                System.out.println("    [2] Go+129");
                System.out.println("    [3] Gp+149");
                break;

            case 2:
                System.out.println("\n*** Go Promos ***");
                System.out.println("    [1] Go50");
                System.out.println("    [2] Go90");
                System.out.println("    [3] Go120");
                break;

            case 3:
                System.out.println("\n*** GoEXTRA Promos ***");
                System.out.println("    [1] GoEXTRA99");
                System.out.println("    [2] GoEXTRA129");
                System.out.println("    [3] GoEXTRA149");
                break;

            case 4:
                System.out.println("\n*** UNLI 5G Promos ***");
                System.out.println("    [1] UNLI 5G 99");
                System.out.println("    [2] UNLI 5G 149");
                System.out.println("    [3] UNLI 5G 199");
                break;

            case 5:
                System.out.println("\n*** ALLNET Promos ***");
                System.out.println("    [1] ALLNET99");
                System.out.println("    [2] ALLNET149");
                System.out.println("    [3] ALLNET199");
                break;
        }

        System.out.print("Enter a choice: ");
        int promoChoice = scanner.nextInt();

        String promoName = "";

        // Selection of promo
        switch (mainChoice) {

            case 1:
                switch (promoChoice) {
                    case 1:
                        promoName = "Go+99";
                        break;
                    case 2:
                        promoName = "Go+129";
                        break;
                    case 3:
                        promoName = "Go+149";
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        return;
                }
                break;

            case 2:
                switch (promoChoice) {
                    case 1:
                        promoName = "Go50";
                        break;
                    case 2:
                        promoName = "Go90";
                        break;
                    case 3:
                        promoName = "Go120";
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        return;
                }
                break;

            case 3:
                switch (promoChoice) {
                    case 1:
                        promoName = "GoEXTRA99";
                        break;
                    case 2:
                        promoName = "GoEXTRA129";
                        break;
                    case 3:
                        promoName = "GoEXTRA149";
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        return;
                }
                break;

            case 4:
                switch (promoChoice) {
                    case 1:
                        promoName = "UNLI 5G 99";
                        break;
                    case 2:
                        promoName = "UNLI 5G 149";
                        break;
                    case 3:
                        promoName = "UNLI 5G 199";
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        return;
                }
                break;

            case 5:
                switch (promoChoice) {
                    case 1:
                        promoName = "ALLNET99";
                        break;
                    case 2:
                        promoName = "ALLNET149";
                        break;
                    case 3:
                        promoName = "ALLNET199";
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        return;
                }
                break;
        }

        // Promo Details
        String promoDetails;

        if (promoName.equals("Go+99")) {
            promoDetails = "Get 8 GB for all sites + 8GB";
        } else {
            promoDetails = "Promo details for " +promoName;
        }

        System.out.println("\n*** " + promoName + " Promo ***");
        System.out.println("-> " + promoDetails);
        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Exit");
        System.out.print("Enter a choice: ");

        int actionChoice = scanner.nextInt();

        // Subscribe or Exit
        if (actionChoice == 1) {
            System.out.println("\nYou are now subscribed to " + promoName);
            return;
        } else if (actionChoice == 2) {
            return;
        } else {
            System.out.println("Invalid Choice");
            return;
        }
    }
}
