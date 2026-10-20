package com.joysistvi.day6.ifstatement;

public class ifElseStatement {

    public static void main(String[] args) {
        // Program that identifies if age is Valid or Invalid
        //int age = 17;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        int age = 17;
        String result = "";

        if (age >= 18) {
            // Execute when age is 18 or older
            result = "Valid Age";
        } else {
            // Execute when age is 17 or below
            result = "Invalid Age";
        }

        System.out.println(age + " is " + result);
    }
}
