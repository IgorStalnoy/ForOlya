package org.example.homework7.task3.employee;

public abstract class Employee {

    private float balance;
    private final boolean isPercentSalaryAvailable;
    private final boolean isHourlySalaryAvailable;
    private int percentage;
    private int hourlyRate;


    public Employee(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable) {
        this.balance = 0;
        this.isPercentSalaryAvailable = isPercentSalaryAvailable;
        this.isHourlySalaryAvailable = isHourlySalaryAvailable;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getBalance() {
        return balance;
    }

    public boolean isPercentSalaryAvailable() {
        return isPercentSalaryAvailable;
    }

    public boolean isHourlySalaryAvailable() {
        return isHourlySalaryAvailable;
    }

    public int getPercentage() {
        return percentage;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
