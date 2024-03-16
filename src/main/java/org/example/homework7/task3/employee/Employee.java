package org.example.homework7.task3.employee;

public abstract class Employee {

    private float balance;
    private boolean isPercentSalaryAvailable;
    private boolean isHourlySalaryAvailable;
    private int percentage;
    private int hourlyRate;


    public Employee(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable) {
        this.balance = 0;
        this.isPercentSalaryAvailable = isPercentSalaryAvailable;
        this.isHourlySalaryAvailable = isHourlySalaryAvailable;
    }

    public void calculateSalary(int revenue, int hoursWorked) {
        if (isHourlySalaryAvailable && isPercentSalaryAvailable) {
            balance += (float) ((revenue * percentage / 100) + (hourlyRate * hoursWorked));
        } else if (isPercentSalaryAvailable) {
            balance += (float) (revenue * percentage / 100);
        } else {
            balance += hourlyRate * hoursWorked;
        }
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

}
