package org.example.homework1.task3;

import java.util.Scanner;

//задать время в секундах. Вывести на экран вплоть до недель, классика
public class либо_main_либо_runner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please, input number of seconds: ");
        System.out.println(secondsToWeeksConverter(in.nextInt()));

    }
    public static String secondsToWeeksConverter (int secondsTotal) {
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_WEEK =7;

        int seconds = secondsTotal % SECONDS_IN_MINUTE;
        int minutesLeft = (secondsTotal - seconds) / 60;
        int minutes = minutesLeft % MINUTES_IN_HOUR;
        int hoursLeft = (minutesLeft - minutes) / 60;
        int hours = hoursLeft % HOURS_IN_DAY;
        int daysLeft = (hoursLeft - hours) / 24;
        int days = daysLeft % DAYS_IN_WEEK;
        int weeks = (daysLeft - days) / 7;
        return "in " + secondsTotal + " seconds are : " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
    }
}
