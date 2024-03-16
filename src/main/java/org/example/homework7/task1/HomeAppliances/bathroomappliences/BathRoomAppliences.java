package org.example.homework7.task1.HomeAppliances.bathroomappliences;

import org.example.homework7.task1.HomeAppliances.HomeAppliances;

public abstract class BathRoomAppliences extends HomeAppliances {

    private boolean isNeedGrounding;

    public BathRoomAppliences(int price, boolean isNeedGrounding) {
        super(price);
        this.isNeedGrounding = isNeedGrounding;
    }

}
