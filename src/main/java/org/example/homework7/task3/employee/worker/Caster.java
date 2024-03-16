package org.example.homework7.task3.employee.worker;

public class Caster extends Worker {

    private boolean isDrinksAtWork;

    public Caster(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable, int discharge, boolean isDrinksAtWork) {
        super(isPercentSalaryAvailable, isHourlySalaryAvailable, discharge);
        this.isDrinksAtWork = isDrinksAtWork;
    }
}
