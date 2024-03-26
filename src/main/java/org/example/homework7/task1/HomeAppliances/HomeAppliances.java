package org.example.homework7.task1.HomeAppliances;

public abstract class HomeAppliances {

    private int price;
    private boolean isPluggedIn;

    public HomeAppliances(int price) {
        this.price = price;
        this.isPluggedIn = false;
    }

    public void changeState() {
        isPluggedIn = !isPluggedIn;
    }


    public boolean isPluggedIn() {
        return isPluggedIn;
    }

}
