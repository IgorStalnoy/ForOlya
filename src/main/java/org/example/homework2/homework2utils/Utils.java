package org.example.homework2.homework2utils;

import java.util.Scanner;

public class Utils {

    public static int dateInputScan(Scanner scanner, String dateInputText, int dateMaxNumber) {
        int dateNumber = 0;
        boolean validValue;
        System.out.println(dateInputText);
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                dateNumber = scanner.nextInt();
                if (dateNumber > dateMaxNumber || dateNumber < 1) {
                    validValue = false;
                    System.out.println("Number should be less then " + (dateMaxNumber + 1) + " and bigger then 0");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return dateNumber;
    }

    public static int inputSideValuesScan(Scanner scanner, String side) {
        int sideLength = 0;
        boolean validValue;
        System.out.println("Please input length of side " + side);
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                sideLength = scanner.nextInt();
                if (sideLength < 1) {
                    validValue = false;
                    System.out.println("Number should be bigger then 0");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return sideLength;
    }

    public static int inputDaysScan(Scanner scanner) {
        int dayNumber = 0;
        boolean validValue;
        System.out.println("Please enter a day number");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                dayNumber = scanner.nextInt();
                if (dayNumber < 1 || dayNumber > 7) {
                    validValue = false;
                    System.out.println("Number should be bigger then 0 and less then 7");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return dayNumber;
    }

}
