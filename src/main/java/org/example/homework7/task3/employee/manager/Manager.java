package org.example.homework7.task3.employee.manager;

import org.example.homework7.task3.employee.Employee;

public abstract class Manager extends Employee {

    private boolean isCanGiveInstructions;

    public Manager(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable, boolean isCanGiveInstructions) {
        super(isPercentSalaryAvailable, isHourlySalaryAvailable);
        this.isCanGiveInstructions = isCanGiveInstructions;
    }
}
