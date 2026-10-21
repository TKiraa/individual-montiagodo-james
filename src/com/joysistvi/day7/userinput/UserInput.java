package com.joysistvi.day7.userinput;

import java.util.Scanner;

public class UserInput {

    public void main(String[] args) {
        // Instantiate Scanner Class / Create an Object of Scanner
        Scanner scanner = new Scanner(System.in);

        // Promt the user for input
        System.out.print("Enter day number (1-7): ");

        // Get user input using nextInt() and stores it to variable day
        int day = scanner.nextInt();
        String dayName = "";

        if (day == 1) {
            // Execute when day is 1
            dayName = "Sunday";
        } else if (day == 2){
            // Execute when day is 2
            dayName = "Monday";
        } else if (day == 3){
            // Execute when day is 3
            dayName = "Tuesday";
        } else if (day == 4){
            // Execute when day is 4
            dayName = "Wednesday";
        } else if (day == 5){
            // Execute when day is 5
            dayName = "Thursday";
        } else if (day == 6){
            // Execute when day is 6
            dayName = "Friday";
        } else if (day == 7){
            // Execute when day is 7
            dayName = "Saturday";
        } else {
            dayName = ("Invalid Day");
        }

        System.out.println(dayName);
    }
}
