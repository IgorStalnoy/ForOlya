package org.example.homework2.task4;

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

}
