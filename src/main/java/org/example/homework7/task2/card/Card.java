package org.example.homework7.task2.card;

public abstract class Card {

    private boolean isVirtual;

    public Card(boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public boolean isVirtual() {
        return isVirtual;
    }

    public void setVirtual(boolean virtual) {
        isVirtual = virtual;
    }
}
