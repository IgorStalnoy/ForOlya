package org.example.homework7.task1.HomeAppliances.bathroomappliences;

public class HairDryer extends BathRoomAppliences {

    private int power;

    public HairDryer(int price, boolean isNeedGrounding, int power) {
        super(price, isNeedGrounding);
        this.power = power;
    }
}
