package org.example.homework7.task2.card.debitcard;

import org.example.homework7.task2.card.Card;

public abstract class DebitCard extends Card {

    private int dailyWithdrawLimit;

    public DebitCard(boolean isVirtual, int dailyWithdrawLimit) {
        super(isVirtual);
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public int getDailyWithdrawLimit() {
        return dailyWithdrawLimit;
    }

    public void setDailyWithdrawLimit(int dailyWithdrawLimit) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }
}
