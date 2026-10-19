package com.joysistvi.day5.operator;

public class Activity3_Montiagodo {

    public static void main(String[] args) {

        //2
        System.out.println("--- Task 2: Event Entry Check ---");
        int age = 18;
        boolean hasValidID = true;

        boolean isAllowedToEnter = age >= 18 && hasValidID;
        String enter = (isAllowedToEnter) ? "Yes" : "No";
        System.out.println("Allowed to enter the event: " + enter);


        //3
        System.out.println("\n--- Task 3: Class Status Check ---");
        boolean isWeekend = true;
        boolean isHoliday = false;

        String noClasses = (isWeekend || isHoliday) ? "Yes, no classes." : "No, there are classes.";
        System.out.println("Are there no classes today? " + noClasses);


        //4
        System.out.println("\n--- Task 4: Pass or Fail Check ---");
        int score = 85;

        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Score: 85" + "\nResult: " + result);


        //6
        System.out.println("\n--- Task 5: Larger Number Check ---");
        int num = 10;
        int num2 = 25;

        int larger = (num > num2) ? num : num2;
        System.out.println("Number 1: 10, Number 2: 25" + "\nThe larger number is: " + larger);

    }
}
