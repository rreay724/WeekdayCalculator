package com.practice;

import java.util.Scanner;

public class Weekday {

    public static void main (String[] args) {

        // displaying legend
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

        int century = year/100;
        int yearPart = year % 100;

        int monthMath = ((month + 1) * 26) / 10;
        System.out.println(monthMath);

        int yearPartMath = (yearPart/4);
        System.out.println(yearPartMath);

        int centuryMath = (century / 4);
        System.out.println(centuryMath);

        int weekDay = (day + monthMath + yearPart + yearPartMath + centuryMath + (5 * century)) % 7;
        System.out.println("Day of the week is " + weekDay);










    }

}
