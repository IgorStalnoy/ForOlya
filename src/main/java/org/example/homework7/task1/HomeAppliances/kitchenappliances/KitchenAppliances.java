package org.example.homework7.task1.HomeAppliances.kitchenappliances;

import org.example.homework7.task1.HomeAppliances.HomeAppliances;

public abstract class KitchenAppliances extends HomeAppliances {

    private boolean isProtectedFromWater;

    public KitchenAppliances(int price, boolean isProtectedFromWater) {
        super(price);
        this.isProtectedFromWater = isProtectedFromWater;
    }
}
