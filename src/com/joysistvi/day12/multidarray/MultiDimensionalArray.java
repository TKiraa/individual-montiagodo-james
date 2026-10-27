package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // coordinates: rows & column
        int[][] numbers = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8, 9}, {0}};
        //                      [row][column]
        //System.out.println(numbers[2][2]);

        //System.out.println(numbers[1].length);

//        System.out.println("Traversing a multi-dimensional array using nested for loop:");
//        //                  0   <   4
//        for (int rows = 0; rows < numbers.length; rows++) { // outer loop
//            //                       0  <  5
//            for (int column = 0; column < numbers[rows].length; column++) {
//                //                           0      0
//                System.out.println(numbers[rows][column]);
//            }
//            System.out.println();
//        }

//        System.out.println("Traversing a multi-dimensional array using nested for-each loop: ");
//        for (int[] rows : numbers) {
//            for (int column : rows) {
//                System.out.println(column);
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter size of row: ");
//        int row= scanner.nextInt();
//        System.out.print("Enter size of column: ");
//        int columns = scanner.nextInt();
        // Declare an MultiDimensional  array with a specified size only
        String[][] planets = new String[2][2];

            for (int rows = 0; rows < planets.length; rows++) {
                for (int column = 0; column < planets[rows].length; column++) {
                    System.out.print("Enter planet[" + (rows + 1) + "][" + (column + 1) + "]: ");
                    planets[rows][column] = scanner.nextLine();
                }
                System.out.println();

            }

            // Printing all the elements using for eah loop
            for (String[] rows : planets) {
                System.out.print("[ ");
                for (String column : rows) {
                    System.out.print(column + " ");
                }
                System.out.println("] ");
            }
    }
}
