package com.joysistvi.day16.methods;

public class JavaMethod {

    public static void main(String[] args) {
        int year = 2027;
        if (year == 2026) {
            greet("James", 21);
        } else if (year == 2027) {
            greet("Jm",22);
        }

    }

    // does not return anything
    public static void greet(String name , int age) {
        // String name = "Winter";
        print("Hello, my name is " + name);
        print("I am " + age + " years old.");
    }

    public static void print(String word) {
        System.out.println(word);
    }

}

/*

    public static void main(String[] args) {
    System.out.println(sum(5,10)); // invoke method
    }

    public static int sum(int a, int b) {
        return a + b;
    }
 */
