package org.example.Homework1_dataTypes_vars_operators_methods.Task3;

//задать время в секундах. Вывести на экран вплоть до недель, классика
public class Task3 {
    public static void main(String[] args) {

        int secondsTotal = 1234121356;
        int seconds = secondsTotal % 60;
        int minutesLeft = (secondsTotal - seconds) / 60;
        int minutes = minutesLeft % 60;
        int hoursLeft = (minutesLeft - minutes) / 60;
        int hours = hoursLeft % 24;
        int daysLeft = (hoursLeft - hours) / 24;
        int days = daysLeft % 7;
        int weeks = (daysLeft - days) / 7;
        System.out.println("in " + secondsTotal + " seconds are : " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

    }
}
