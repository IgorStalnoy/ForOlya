package org.example.homework7.task2.card.creditcard;

public class FunnyCreditsCard extends CreditCard {

    private String paymentSystem;
    private boolean isCashbackAvailable;
    private int interestRate;

    public FunnyCreditsCard(boolean isVirtual, int overdraftLimit, String paymentSystem, boolean isCashbackAvailable, int interestRate) {
        super(isVirtual, overdraftLimit);
        this.paymentSystem = paymentSystem;
        this.isCashbackAvailable = isCashbackAvailable;
        this.interestRate = interestRate;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public boolean isCashbackAvailable() {
        return isCashbackAvailable;
    }

    public void setCashbackAvailable(boolean cashbackAvailable) {
        isCashbackAvailable = cashbackAvailable;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
