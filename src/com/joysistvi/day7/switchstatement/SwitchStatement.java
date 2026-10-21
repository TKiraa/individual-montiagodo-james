package com.joysistvi.day7.switchstatement;

public class SwitchStatement {

    public static void main(String[] args) {
        String sizeCode = "XL";
        String sizeDescription = "";

        switch (sizeCode) {
            case "XS":
                sizeDescription = "Extra Small";
                break;
            case "S":
                sizeDescription = "Small";
                break;
            case "M":
                sizeDescription = "Medium";
                break;
            case "L":
                sizeDescription = "Large";
                break;
            case "XL":

                sizeDescription = "Extra Large";
                break;
            default:

                sizeDescription = "Invalid Size Code! Please enter XS, S, M, L, or Xl.";

        }
        System.out.println("Size: " + sizeDescription);
    }
}
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
 */

    /*
    int day = 1;
        String dayName = "";

        //A switch  statement  evaluates an expression (in this case, the variable day and matches  its value againts define 'case' labels.

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
        }

        System.out.println("Today is: " + dayName);
    }
    // Bawal: boolean, long, float , double
    // Pwede: byte, short, int, enum
}
     */