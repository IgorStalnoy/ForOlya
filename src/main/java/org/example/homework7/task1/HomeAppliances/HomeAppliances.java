package org.example.homework7.task1.HomeAppliances;

public abstract class HomeAppliances {

    private int price;
    private boolean isPluggedIn;

    public HomeAppliances(int price) {
        this.price = price;
        this.isPluggedIn = false;
    }

    public void setPluggedIn() {
        isPluggedIn = true;
    }

    public void setPluggedOff() {
        isPluggedIn = false;
    }


    public boolean isPluggedIn() {
        return isPluggedIn;
    }

}
