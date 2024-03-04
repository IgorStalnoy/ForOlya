package org.example.homework2.task4;

//Задать три числа - день, месяц, год. Вывести на экран в виде трёх чисел дату следующего дня.

import java.util.Scanner;

public class Main {
    public static final int DAYS_IN_MONTH = 30;
    public static final int MONTHS_IN_YEAR = 12;
    public static final int MAX_INT = 2147483646;

    public static final String DAY_INPUT_TEXT = "Please input a day";
    public static final String MONTH_INPUT_TEXT = "Please input a month";
    public static final String YEAR_INPUT_TEXT = "Please input a year";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = Utils.dateInputScan(scanner, DAY_INPUT_TEXT, DAYS_IN_MONTH);
        int month = Utils.dateInputScan(scanner, MONTH_INPUT_TEXT, MONTHS_IN_YEAR);
        int year = Utils.dateInputScan(scanner, YEAR_INPUT_TEXT, MAX_INT);

        String nextDate = calculateNextDay(day, month, year);
        System.out.println(nextDate);
    }

    public static String calculateNextDay(int day, int month, int year) {
        if (day == DAYS_IN_MONTH) {
            day = 1;
            if (month == MONTHS_IN_YEAR) {
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

}

