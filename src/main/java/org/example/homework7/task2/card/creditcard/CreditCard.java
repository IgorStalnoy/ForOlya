package org.example.homework7.task2.card.creditcard;

import org.example.homework7.task2.card.Card;

public abstract class CreditCard extends Card {

    private int overdraftLimit;

    public CreditCard(boolean isVirtual, int overdraftLimit) {
        super(isVirtual);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
