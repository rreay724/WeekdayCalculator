package com.practice;

import java.util.Scanner;

public class Weekday {

    public static void main (String[] args) {

        // Displays legend
        System.out.println("This will calculate what day of the week for date provided.");
        System.out.println("=================================================================");

        Scanner scanner = new Scanner(System.in);

        // Get day, month and year
        System.out.println("Enter day: ");
        int day = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        /** century and yearpart variables **/
        // For 2007 the century would be 20
        int century = year/100;

        // Yearpart is the year within the century. For 1994 the yearpart would be 94
        int yearPart = year % 100;


        /** The Algorithm to calculate the day of the week is as follows:
        weekday = (day + (((month + 1) *26) / 10) + yearpart + (yearpart/4) + (century/4) + (5*century)) mod 7 **/

        // Calculations
//        int monthMath = ((month + 1) * 26) / 10;
//        System.out.println(monthMath);

//        int yearPartMath = (yearPart/4);
//        System.out.println(yearPartMath);

//        int centuryMath = (century / 4);
//        System.out.println(centuryMath);

        // Final calculation
//        int weekDay = (day + monthMath + yearPart + yearPartMath + centuryMath + (5 * century)) % 7;
//        System.out.println("Day of the week is " + weekDay);

        int weekDay = (day + (((month + 1) * 26) / 10) + yearPart + (yearPart/4) + (century/4) + (5 * century)) % 7;

        System.out.println("=================================================================");

        String [] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is " + daysOfWeek[weekDay]);

//        Map<Integer, String> map = new HashMap<>();
//        map.put(0, "Saturday");
//        map.put(1, "Sunday");
//        map.put(2, "Monday");
//        map.put(3, "Tuesday");
//        map.put(4, "Wednesday");
//        map.put(5, "Thursday");
//        map.put(6, "Friday");
//
//        Set<Integer> keys = map.keySet();
//        for(Integer key : keys){
//            if (key == weekDay){
//                System.out.println("The day of the week is " + map.get(key));
//            }
//        }

//        if(weekDay == 0){
//            System.out.println("Day of the week is Saturday");
//        } else if( weekDay == 1){
//            System.out.println("Day of the week is Sunday");
//        } else if(weekDay == 2){
//            System.out.println("Day of the week is Monday");
//        } else if(weekDay == 3){
//            System.out.println("Day of the week is Tuesday");
//        } else if (weekDay == 4){
//            System.out.println("Day of the week is Wednesday");
//        } else if (weekDay == 5){
//            System.out.println("Day of the week is Thursday");
//        } else {
//            System.out.println("Day of the week is Friday");
//        }
    }

}
