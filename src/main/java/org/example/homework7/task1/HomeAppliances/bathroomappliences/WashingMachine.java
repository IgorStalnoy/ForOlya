package org.example.homework7.task1.HomeAppliances.bathroomappliences;

public class WashingMachine extends BathRoomAppliences {

    private int capacity;

    public WashingMachine(int price, boolean isNeedGrounding, int capacity) {
        super(price, isNeedGrounding);
        this.capacity = capacity;
    }
}
