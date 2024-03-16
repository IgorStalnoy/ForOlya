package org.example.homework7.task1.HomeAppliances.kitchenappliances;

public class Toaster extends KitchenAppliances {

    private int countOfToastsSimultaneously;

    public Toaster(int price, boolean isProtectedFromWater, int countOfToastsSimultaneously) {
        super(price, isProtectedFromWater);
        this.countOfToastsSimultaneously = countOfToastsSimultaneously;
    }
}
