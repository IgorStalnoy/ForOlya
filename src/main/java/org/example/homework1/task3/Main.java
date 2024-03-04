package org.example.homework1.task3;

import java.util.Scanner;

//задать время в секундах. Вывести на экран вплоть до недель, классика
public class Main {
    public final static int SECONDS_IN_MINUTE = 60;
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURS_IN_DAY = 24;
    public final static int DAYS_IN_WEEK =7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(convertSecondsToWeeks(secondsInputScan(in)));
    }
    public static String convertSecondsToWeeks(int secondsTotal) {
        int seconds = secondsTotal % SECONDS_IN_MINUTE;
        int minutesLeft = (secondsTotal - seconds) / SECONDS_IN_MINUTE;
        int minutes = minutesLeft % MINUTES_IN_HOUR;
        int hoursLeft = (minutesLeft - minutes) / MINUTES_IN_HOUR;
        int hours = hoursLeft % HOURS_IN_DAY;
        int daysLeft = (hoursLeft - hours) / HOURS_IN_DAY;
        int days = daysLeft % DAYS_IN_WEEK;
        int weeks = (daysLeft - days) / DAYS_IN_WEEK;
        return "in " + secondsTotal + " seconds are : " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
    }
    public static int secondsInputScan(Scanner scanner) {
        int seconds = 0;
        boolean validValue;
        System.out.println("Please, input number of seconds: ");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                seconds = scanner.nextInt();
            }
        } while (!validValue);
        return seconds;
    }
}
