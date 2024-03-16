package org.example.homework7.task1.HomeAppliances.kitchenappliances;

public class Mixer extends KitchenAppliances {

    private int power;

    public Mixer(int price, boolean isProtectedFromWater, int power) {
        super(price, isProtectedFromWater);
        this.power = power;
    }

}
