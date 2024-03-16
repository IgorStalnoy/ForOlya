package org.example.homework7.task3.employee.manager;

public class Accountant extends Manager {

    private int drinksLitersOfTeaADay;
    private boolean agreeToDoBlackBookkeeping;

    public Accountant(boolean isPercentSalaryAvailable, boolean isHourlySalaryAvailable, boolean isCanGiveInstructions, int drinksLitersOfTeaADay, boolean agreeToDoBlackBookkeeping) {
        super(isPercentSalaryAvailable, isHourlySalaryAvailable, isCanGiveInstructions);
        this.drinksLitersOfTeaADay = drinksLitersOfTeaADay;
        this.agreeToDoBlackBookkeeping = agreeToDoBlackBookkeeping;
    }
}
