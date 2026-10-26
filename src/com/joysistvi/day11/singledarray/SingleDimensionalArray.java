package com.joysistvi.day11.singledarray;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        // syntax
        // 24, 26, 30, 38, 17

        // indices:    0   1   2   3   4   5   6
        int[] ages = { 24, 26, 30, 38, 17, 50, 60 };

        // invoke an element
        //System.out.println(age[2]);

        // get the length of an array
        //System.out.println(age.length);

        // travers an array using for-loop
        for (int i = 0; i < ages.length; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(ages[i]);
        }

        // for-each loop
        for (int age : ages) {
            System.out.println(age);
        }

    }
}
