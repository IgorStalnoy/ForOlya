package org.example.homework2.task6;

public enum DaysNames {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static DaysNames getDay(int dayNumber) {
        return DaysNames.values()[dayNumber - 1];
    }
}