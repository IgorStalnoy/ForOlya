package org.example.homework7.task2.card.debitcard;

public class PensionCard extends DebitCard{

    private boolean isParticipatesInSweepstakes;
    private int cumulativePercent;

    public PensionCard(boolean isVirtual, int dailyWithdrawLimit, boolean isParticipatesInSweepstakes, int cumulativePercent) {
        super(isVirtual, dailyWithdrawLimit);
        this.isParticipatesInSweepstakes = isParticipatesInSweepstakes;
        this.cumulativePercent = cumulativePercent;
    }

    public boolean isParticipatesInSweepstakes() {
        return isParticipatesInSweepstakes;
    }

    public void setParticipatesInSweepstakes(boolean participatesInSweepstakes) {
        isParticipatesInSweepstakes = participatesInSweepstakes;
    }

    public int getCumulativePercent() {
        return cumulativePercent;
    }

    public void setCumulativePercent(int cumulativePercent) {
        this.cumulativePercent = cumulativePercent;
    }
}
