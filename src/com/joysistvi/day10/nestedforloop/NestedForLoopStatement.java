package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {
    public static void main(String[] args) {
        // syntax of nested for loop
        // The inner loop executes completely whenever outer loop executes.
        //
        for (int i = 10; i >= 1; i--) {
            //              1 <= 3
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /* Mini-Activity: Nested For Loop

         * * * * *
         * * * *
         * * *
         * *
         *

         */

        //

        // break & continue

    }
}
/*
    for (int i = 1; i <= 10; i++) { // outer loop
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) { // inner loop
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); //; new line
        }
 */