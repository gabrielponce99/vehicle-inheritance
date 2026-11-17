package com.pluralsight;

public class Moped extends Vehicle {
    private boolean kickstandDown;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean kickstandDown) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.kickstandDown = kickstandDown;
    }

    public boolean isKickstandDown() {
        return kickstandDown;
    }
}
