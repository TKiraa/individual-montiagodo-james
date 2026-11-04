package com.joysistvi.day13.string;

public class MiniActivity {

    public static void main(String[] args) {
        String country = "Philippines".toLowerCase();
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'P' || country.charAt(i) == 'p'){
                count++;
            }

        }
        System.out.println("Letter P/p Count: " + count);

        count = 0;
        for (int i = 0; i < country.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (country.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }

        System.out.println("Vowels Count: " + count);
    }
}
