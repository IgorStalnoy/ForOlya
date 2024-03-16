package org.example.homework7.task2;

import org.example.homework7.task2.card.creditcard.FunnyCreditsCard;
import org.example.homework7.task2.card.debitcard.PensionCard;

/** Описать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки. Иерархия додлжна иметь хотя бы три уровня.
 */

public class Main {

    public static void main(String[] args) {

        FunnyCreditsCard funnyCreditsCard = new FunnyCreditsCard(true,10000,"Visa",true, 5);
        PensionCard pensionCard = new PensionCard(false,20000,true,13);

    }
}
