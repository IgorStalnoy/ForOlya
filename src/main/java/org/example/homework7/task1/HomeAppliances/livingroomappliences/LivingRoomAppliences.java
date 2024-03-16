package org.example.homework7.task1.HomeAppliances.livingroomappliences;

import org.example.homework7.task1.HomeAppliances.HomeAppliances;

public abstract class LivingRoomAppliences extends HomeAppliances {

    private boolean isNiceForGuests;

    public LivingRoomAppliences(int price, boolean isNiceForGuests) {
        super(price);
        this.isNiceForGuests = isNiceForGuests;
    }
}
