package com.joysistvi.day10.nestedforloop;

public class MiniActivity {
    public static void main(String[] args) {
        // Syntax of nested for loop
        // The inner loop executes completely whenever outer loop executes.
        for (int i = 1; i <= 5; i++) {
            //              1 <= 3
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
