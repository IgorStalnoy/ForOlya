package org.example.homework7.task3;

import org.example.homework7.task3.employee.Employee;

public class SalaryCalc {

    private SalaryCalc() {
    }

    public static void calculateSalary(Employee employee, Factory factory) {
        if (employee.isHourlySalaryAvailable() && employee.isPercentSalaryAvailable()) {
            employee.setBalance(employee.getBalance() + (float) (factory.getMonthlyRevenue() * employee.getPercentage() / 100) + (employee.getHourlyRate()
                    * factory.getMonthlyHoursWorkedRate()));
        } else if (employee.isPercentSalaryAvailable()) {
            employee.setBalance(employee.getBalance() + (float) (factory.getMonthlyRevenue() * employee.getPercentage() / 100));
        } else {
            employee.setBalance(employee.getBalance() + employee.getHourlyRate() * factory.getMonthlyHoursWorkedRate());
        }
    }
}
