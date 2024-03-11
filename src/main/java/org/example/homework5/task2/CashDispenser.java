package org.example.homework5.task2;

import org.example.homework3.utils.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class CashDispenser {
    private int banknotesTwenty;
    private int banknotesFifty;
    private int banknotesOneHundred;

    public CashDispenser(int banknotesOneHundred, int banknotesFifty, int banknotesTwenty) {
        this.banknotesTwenty = banknotesTwenty;
        this.banknotesFifty = banknotesFifty;
        this.banknotesOneHundred = banknotesOneHundred;
    }

    public void withdrawMoney(Scanner scanner) {
        int sum = Utils.inputValueScan(scanner);
        int[] withdrewBanknotes;
        if (isWithdrawPossible(sum)) {
            System.out.println("Transaction completed!");
            withdrewBanknotes = calculateWithdrewBanknotes(sum, false);
            System.out.println("You were given : \n" + withdrewBanknotes[0] + " * 100$ banknotes\n" + withdrewBanknotes[1]
                    + " * 50$ banknotes\n" + withdrewBanknotes[2] + " * 20$ banknotes");
        } else {
            System.out.println("Transaction failed!");
        }
    }

    private boolean isWithdrawPossible(int sum) {
        if (sum > getTotalBalance() || sum % 10 != 0 || sum == 0 || sum == 10) {
            return false;
        }
        int[] zeroBanknotesCalculation = {0, 0, 0};
        return !Arrays.equals(calculateWithdrewBanknotes(sum, true), zeroBanknotesCalculation);
    }

    private int[] calculateWithdrewBanknotes(int sum, boolean isThisValidation) {
        int[] withdrewBanknotes = {0, 0, 0};
        int hundredBanknoteIterationCounter = 0;
        int fiftyBanknoteIterationCounter = 0;
        int banknotesHundredToWithdraw = 0;
        int banknotesFiftyToWithdraw = 0;
        int banknotesTwentyToWithdraw = 0;
        boolean isAllHundredAndFiftyIterationsEnded = (hundredBanknoteIterationCounter + 1) * 100 > sum && (fiftyBanknoteIterationCounter + 1) * 50 > sum;
        if (sum > getTotalBalance() || sum % 10 != 0 || sum == 0 || sum == 10) {
            return withdrewBanknotes;
        }
        do {
            if (isAllHundredAndFiftyIterationsEnded) {
                hundredBanknoteIterationCounter = 0;
            }
            if (sum >= 100 && banknotesOneHundred != 0 && (hundredBanknoteIterationCounter + 1) * 100 <= sum) {
                if (banknotesOneHundred <= ((sum / 100))) {
                    banknotesHundredToWithdraw = banknotesOneHundred - hundredBanknoteIterationCounter;
                } else {
                    banknotesHundredToWithdraw = (sum / 100) - hundredBanknoteIterationCounter;
                }
                sum = sum - (100 * banknotesHundredToWithdraw);
                banknotesOneHundred = banknotesOneHundred - banknotesHundredToWithdraw;
                if (sum == 0) {
                    withdrewBanknotes[0] = banknotesHundredToWithdraw;
                    withdrewBanknotes[1] = banknotesFiftyToWithdraw;
                    withdrewBanknotes[2] = banknotesTwentyToWithdraw;
                    if (isThisValidation) {
                        banknotesOneHundred += banknotesHundredToWithdraw;
                        banknotesFifty += banknotesFiftyToWithdraw;
                        banknotesTwenty += banknotesTwentyToWithdraw;
                    }
                    return withdrewBanknotes;
                }
            }

            if (sum >= 50 && banknotesFifty != 0 && (fiftyBanknoteIterationCounter + 1) * 50 <= sum) {
                if (banknotesFifty <= ((sum / 50))) {
                    banknotesFiftyToWithdraw = banknotesFifty - fiftyBanknoteIterationCounter;
                } else {
                    banknotesFiftyToWithdraw = (sum / 50) - fiftyBanknoteIterationCounter;
                }
                sum = sum - (50 * banknotesFiftyToWithdraw);
                banknotesFifty = banknotesFifty - banknotesFiftyToWithdraw;
                if (sum == 0) {
                    withdrewBanknotes[0] = banknotesHundredToWithdraw;
                    withdrewBanknotes[1] = banknotesFiftyToWithdraw;
                    withdrewBanknotes[2] = banknotesTwentyToWithdraw;
                    if (isThisValidation) {
                        banknotesOneHundred += banknotesHundredToWithdraw;
                        banknotesFifty += banknotesFiftyToWithdraw;
                        banknotesTwenty += banknotesTwentyToWithdraw;
                    }
                    return withdrewBanknotes;
                }
            }
            if (banknotesHundredToWithdraw == 0 && banknotesFiftyToWithdraw == 0 && sum / 20 > banknotesTwenty) {
                return withdrewBanknotes;
            }
            if (sum >= 20 && banknotesTwenty != 0 || sum > 0 && banknotesHundredToWithdraw != 0 || sum > 0 && banknotesFiftyToWithdraw != 0) {
                banknotesTwentyToWithdraw = Math.min(banknotesTwenty, ((sum / 20)));
                sum = sum - (20 * banknotesTwentyToWithdraw);
                banknotesTwenty = banknotesTwenty - banknotesTwentyToWithdraw;
                if (sum == 0) {
                    withdrewBanknotes[0] = banknotesHundredToWithdraw;
                    withdrewBanknotes[1] = banknotesFiftyToWithdraw;
                    withdrewBanknotes[2] = banknotesTwentyToWithdraw;
                    if (isThisValidation) {
                        banknotesOneHundred += banknotesHundredToWithdraw;
                        banknotesFifty += banknotesFiftyToWithdraw;
                        banknotesTwenty += banknotesTwentyToWithdraw;
                    }
                    return withdrewBanknotes;
                }
                if (banknotesHundredToWithdraw > 0) {
                    hundredBanknoteIterationCounter++;
                    sum = sum + (100 * banknotesHundredToWithdraw);
                    banknotesOneHundred = banknotesOneHundred + banknotesHundredToWithdraw;
                    banknotesHundredToWithdraw = 0;
                    sum = sum + (banknotesTwentyToWithdraw * 20);
                    banknotesTwenty = banknotesTwenty + banknotesTwentyToWithdraw;
                    banknotesTwentyToWithdraw = 0;
                }
                if (banknotesFiftyToWithdraw > 0) {
                    fiftyBanknoteIterationCounter++;
                    if (hundredBanknoteIterationCounter != 0 && fiftyBanknoteIterationCounter <= 3) {
                        hundredBanknoteIterationCounter = 0;
                    }
                    sum = sum + (50 * banknotesFiftyToWithdraw);
                    banknotesFifty = banknotesFifty + banknotesFiftyToWithdraw;
                    banknotesFiftyToWithdraw = 0;
                    sum = sum + (banknotesTwentyToWithdraw * 20);
                    banknotesTwenty = banknotesTwenty + banknotesTwentyToWithdraw;
                    banknotesTwentyToWithdraw = 0;
                }
//                if (banknotesHundredToWithdraw == 0 && banknotesFiftyToWithdraw == 0) {   // недоделанное условие выходап из цикла
//                    if (isThisValidation) {
//                        banknotesTwenty += banknotesTwentyToWithdraw;
//                    }
//                    return withdrewBanknotes;
//                }
            }
        } while (sum != 0);
        return withdrewBanknotes;
    }

    public int getTotalBalance() {
        return banknotesTwenty * 20 + banknotesFifty * 50 + banknotesOneHundred * 100;
    }

    public void addBanknotesTwenty(int banknotesTwenty) {
        this.banknotesTwenty += banknotesTwenty;
    }

    public void addBanknotesFifty(int banknotesFifty) {
        this.banknotesFifty += banknotesFifty;
    }

    public void addBanknotesOneHundred(int banknotesOneHundred) {
        this.banknotesOneHundred += banknotesOneHundred;
    }

    public int getBanknotesTwenty() {
        return banknotesTwenty;
    }

    public int getBanknotesFifty() {
        return banknotesFifty;
    }

    public int getBanknotesOneHundred() {
        return banknotesOneHundred;
    }

}
