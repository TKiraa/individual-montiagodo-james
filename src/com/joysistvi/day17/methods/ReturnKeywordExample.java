package com.joysistvi.day17.methods;

public class ReturnKeywordExample {
    // method that contrenate Strings
    public static void main(String[] args) {
        String fullName = createFullName("Anj", "Tan");
        System.out.println("Full Name: " + fullName);
        System.out.println(createGreeting("Jms"));
    }

    public static String createGreeting(String name) {
        return "Hello," + name + "! Welcome to Java";
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
