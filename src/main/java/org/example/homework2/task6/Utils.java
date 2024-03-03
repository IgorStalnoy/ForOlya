package org.example.homework2.task6;

import java.util.Scanner;

public class Utils {
    public static int inputValuesScanning(Scanner scanner) {
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
