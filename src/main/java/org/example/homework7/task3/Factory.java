package org.example.homework7.task3;

public class Factory {

    private int monthlyRevenue;
    private int monthlyHoursWorkedRate;

    public Factory(int monthlyRevenue, int monthlyHoursWorkedRate) {
        this.monthlyRevenue = monthlyRevenue;
        this.monthlyHoursWorkedRate = monthlyHoursWorkedRate;
    }

    public int getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public int getMonthlyHoursWorkedRate() {
        return monthlyHoursWorkedRate;
    }
}
