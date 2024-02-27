package org.example.homework2.task4;

//Задать три числа - день, месяц, год. Вывести на экран в виде трёх чисел дату следующего дня.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = dayInputScanner(scanner);
        int month = monthInputScanner(scanner);
        int year = yearInputScanner(scanner);

        String nextDate = nextDayCalculator(day, month, year);
        System.out.println(nextDate);
    }

    public static String nextDayCalculator(int day, int month, int year) {
        if (day == 30) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        return "Next day's date is : " + day + "." + month + "." + year;
    }

    public static int dayInputScanner(Scanner scanner) {
        int day = 0;
        boolean validValue;
        System.out.println("Please input a day");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                day = scanner.nextInt();
                if (day > 30 || day < 1) {
                    validValue = false;
                    System.out.println("Number should be less then 31 and bigger then 0");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return day;
    }

    public static int monthInputScanner(Scanner scanner) {
        int month = 0;
        boolean validValue;
        System.out.println("Please input a month");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                month = scanner.nextInt();
                if (month > 12 || month < 1) {
                    validValue = false;
                    System.out.println("Number should be less then 13 and bigger then 0");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return month;
    }

    public static int yearInputScanner(Scanner scanner) {
        int year = 0;
        boolean validValue;
        System.out.println("Please input a year");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                year = scanner.nextInt();
                if (year < 1) {
                    validValue = false;
                    System.out.println("Number should be bigger then 0");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return year;
    }

}

