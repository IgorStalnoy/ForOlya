package org.example.homework5.task1;

public class TimeLine {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_HOUR = 3600;
    private int hours;
    private int minutes;
    private int seconds;


    public TimeLine(int hours, int minutes, int seconds) {
        if (seconds > SECONDS_IN_MINUTE) {
            this.seconds = seconds % SECONDS_IN_MINUTE;
            minutes = minutes + seconds / SECONDS_IN_MINUTE;
        } else {
            this.seconds = seconds;
        }
        if (minutes > MINUTES_IN_HOUR) {
            this.minutes = minutes % MINUTES_IN_HOUR;
            hours = hours + minutes / MINUTES_IN_HOUR;
        } else {
            this.minutes = minutes;
        }
        this.hours = hours;
    }

    public TimeLine(int seconds) {
        this.seconds = seconds % SECONDS_IN_MINUTE;
        int minutes = seconds / SECONDS_IN_MINUTE;
        this.minutes = minutes % MINUTES_IN_HOUR;
        this.hours = minutes / MINUTES_IN_HOUR;
    }

    public int getSecondsTotal() {
        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeLine timeLine = (TimeLine) o;
        return hours == timeLine.hours && minutes == timeLine.minutes && seconds == timeLine.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}



