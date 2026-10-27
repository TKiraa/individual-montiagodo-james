package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9_Montiagodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================================\n" +
                            "                   Average Calculator\n" +
                            "============================================================");

        System.out.print("Enter number of students: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int columns = scanner.nextInt();
        scanner.nextLine();

        String[] students = new String[row];
        String[] subjects = new String[columns];
        double[][] grade = new double[row][columns];
        double[] averages = new double[row];

        System.out.println("\nEnter subject names:");
        for (int column = 0; column < subjects.length; column++) {
            System.out.printf("Subject " + (column + 1) + ": ");
            subjects[column] = scanner.nextLine();
        }
            for (int rows = 0; rows < students.length; rows++) {
                System.out.print("\nName of Student " + (rows + 1) + ": ");
                students[rows] = scanner.nextLine();

                System.out.println("Enter grades for each subject: ");
                double sum = 0;

                for (int column = 0; column < subjects.length; column++) {
                    System.out.print(subjects[column] + ": ");
                    grade[rows][column] = scanner.nextDouble();

                    sum = sum + grade[rows][column];
                }
                averages[rows] = sum / subjects.length;

                scanner.nextLine();
            }

        System.out.println("============================================================\n" +
                            "                      Grades Report\n" +
                            "============================================================");
        System.out.printf("%-20s", "Student");

        for (String subject : subjects) {
            System.out.printf("%-12s", subject);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("------------------------------------------------------------");

        for (int rows = 0; rows < students.length; rows++) {

            System.out.printf("%-20s", students[rows]);

            for (int column = 0; column < subjects.length; column++) {
                System.out.printf("%-12.2f", grade[rows][column]);
            }

            System.out.printf("%.2f%n", averages[rows]);
        }

        scanner.close();
    }
}
