package org.example.homework7.task3.employee.worker;

public class MillingOperator extends Worker {

    private boolean isSpeaksObscenities;

    public MillingOperator(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable, int discharge, boolean isSpeaksObscenities) {
        super(isPercentSalaryAvailable, isHourlySalaryAvailable, discharge);
        this.isSpeaksObscenities = isSpeaksObscenities;
    }
}
