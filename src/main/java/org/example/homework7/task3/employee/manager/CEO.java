package org.example.homework7.task3.employee.manager;

public class CEO extends Manager {

    private int levelInWorldOfWarcraft;

    public CEO(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable, boolean isCanGiveInstructions, int levelInWorldOfWarcraft) {
        super(isPercentSalaryAvailable, isHourlySalaryAvailable, isCanGiveInstructions);
        this.levelInWorldOfWarcraft = levelInWorldOfWarcraft;
    }
}
