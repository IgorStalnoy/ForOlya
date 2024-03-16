package org.example.homework7.task3.employee.worker;

import org.example.homework7.task3.employee.Employee;

public abstract class Worker extends Employee {

    private int discharge;

    public Worker(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable, int discharge) {
        super(isPercentSalaryAvailable, isHourlySalaryAvailable);
        this.discharge = discharge;
    }
}
