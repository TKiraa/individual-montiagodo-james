package com.joysistvi.day10.jumpstatement;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 4) {
                continue; // skip the loop
            }

            System.out.println(i + " Hello");
        }
    }
}

/*
    Good to Remember:
    return = stop the method completely.
    break = stop the loop completely.
    continue = skip this round, but keep looping.
 */