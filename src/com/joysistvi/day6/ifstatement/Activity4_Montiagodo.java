package com.joysistvi.day6.ifstatement;

public class Activity4_Montiagodo {

    public static void main(String[] args) {
        int age = 25;
        String result;

        if (age >= 0 && age <= 100) {

            if (age <= 2) {
                result = "Baby";
            } else if (age <= 12) {
                result = "Child";
            } else if (age <= 19) {
                result = "Teenager";
            } else if (age <= 29) {
                result = "Young Adult";
            } else if (age <= 59) {
                result = "Adult";
            } else {
                result = "Senior";
            }
            System.out.println("Age: " + age + "\nCategory: " + result);
        } else {
            System.out.println("Invalid Age");
        }

    }
}
