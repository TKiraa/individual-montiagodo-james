package com.joysistvi.day7.Nestedif;

public class NestedIfStatement {

    public static void main(String[] args) {
        int age = 60;
        String Category;
        String subCategory = "";

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        } else {

            if (age >= 60) {
                Category = "Senior";

                // 60 - 75 -> Young-old senior
                // 76 - 100 -> Old Senior

                if (age <= 75) {
                    subCategory = "Young-old senior";
                } else {
                    subCategory = "Old Senior";
                }

            } else if (age >= 30) {
                Category = "Adult";
            } else if (age >= 20) {
                Category = "Young Adult";
            } else if (age >= 13) {
                Category = "Teenager";
            } else if (age >= 3) {
                Category = "Child";
            } else {
                Category = "Baby";
                // 0-1 year old = Infant
                // 2 years old = Toddler
            } if(age == 2 ){
                subCategory = "Toddler";
            } else {
                subCategory = "Infant";
            }

            System.out.println("Age: " + age + "\nCategory: " + Category + "\nSubcategory: " + subCategory);
        }

    }
}

