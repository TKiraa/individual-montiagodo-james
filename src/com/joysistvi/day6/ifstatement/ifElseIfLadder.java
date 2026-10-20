package com.joysistvi.day6.ifstatement;

public class ifElseIfLadder {

    public static void main(String[] args) {
        // A(90) B(80+) C(70+) F(70-)
        /*
            F: 1-70
            C: 71-80
            B: 81-90
            A: 91-100
         */
        int grade = 101;
        String result;

        // Nested If Statement
        // Validation

        if (!(grade >= 1 && grade <= 100)) {
            return; // terminate method
        }

        if (grade <= 70) { // 1 - 70
            result = "F";
        } else if (grade <= 80) { // 71 - 80
            result = "C";
        } else if (grade <= 90) {
            result = "B";
        } else if (grade <= 100) {
            result = "A";
        } else {
            result = "Invalid Grade";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);
    }
}


        /*
        if (grade >= 1 && grade <= 100) { // outer if
            // inner if
            if (grade <= 70) { // 1 - 70
                result = "F";
            } else if (grade <= 80) { // 71 - 80
                result = "C";
            } else if (grade <= 90) {
                result = "B";
            } else {
                result = "A";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else {
            System.out.println("Invalid Grade");
        }

    }
}
*/
        /*
        int day = 7;
        String dayName;

        if (day == 1) {
            // Execute when day is 1
            dayName = "Sunday";
        } else if (day == 2){
            // Execute when day is 2
            dayName = "Monday";
        } else if (day == 3){
            // Execute when day is 3
            dayName = "Tuesday";
        } else if (day == 4){
            // Execute when day is 4
            dayName = "Wednesday";
        } else if (day == 5){
            // Execute when day is 5
            dayName = "Thursday";
        } else if (day == 6){
            // Execute when day is 6
            dayName = "Friday";
        } else if (day == 7){
            // Execute when day is 7
            dayName = "Saturday";
        } else {
            dayName = ("Invalid Day");
        }

        System.out.println(dayName);

}

         */