package org.example.homework7.task1.HomeAppliances.livingroomappliences;

public class Iron extends LivingRoomAppliences {

    private int maxTemperature;

    public Iron(int price, boolean isNiceForGuests, int maxTemperature) {
        super(price, isNiceForGuests);
        this.maxTemperature = maxTemperature;
    }
}
