package com.joysistvi.day18.exceptionshandling;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class ExceptionsHandling {

    public static void main(String[] args) {
        // ArrayIndexOutofBoundsException

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int choice = Double.parseDouble(input);
        System.out.println(choice);

        try {
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println(numbers[6]);
        }catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");
    }
}
