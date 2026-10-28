package com.joysistvi.day13.string;

import java.util.Scanner;

public class Activity10_Montiagodo {

    public static void main(String[] args) {

        // String Methods
        String name = "James";

        System.out.println("Example name: " + name);

        // 1. contains()
        System.out.println("Contains [me]: " + name.contains("me"));
        //

        // 2. endsWith()
        System.out.println("Ends With [es]: " + name.endsWith("es"));

        // 3. startsWith()
        System.out.println("Star With [Ja]: " + name.startsWith("Ja"));

        // 4. indexOf()
        System.out.println("Index Of [m]: " + name.indexOf("m"));

        // 5. trim()
        String n = " James ";
        System.out.println("Trim [ James ]: " + n.trim());

        // 6. replace()
        System.out.println("Replace [m to n]: " + name.replace("m", "n"));

        // 7. toCharArray()
        char[] letters = name.toCharArray();
        System.out.println("To Char Array [3]: " + letters[3]);


        // Presentation Phase
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n --- Presentation Phase --- \n" +
                           "Method: contains()\n" +
                           "Explanation: Checks if the string contains specific text.");

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("Enter the text to find: ");
        String text = scanner.nextLine();

        System.out.println("Result: " + word.contains(text));


        // Stretch Goal
        System.out.println("\n --- Stretch Goal --- ");
        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        // Display first and last character
        System.out.println("First Character: " + country.charAt(0));
        System.out.println("Last Character: " + country.charAt(country.length() - 1));

        // Count P/p & vowels (a, e, i, o, u)
        int countChar = 0;
        int countVowels = 0;

        for (int i = 0; i < country.length(); i++) {
            char letter = Character.toLowerCase(country.charAt(i));

            if (letter == 'p') {
                countChar++;
            }

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                countVowels++;
            }
        }
        System.out.println("Number of P/p: " + countChar);
        System.out.println("Total of Vowels: " + countVowels);

        scanner.close();
    }
}
