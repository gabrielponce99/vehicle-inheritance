package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean skirtInflated;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean skirtInflated) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.skirtInflated = skirtInflated;
    }

    public boolean isSkirtInflated() {
        return skirtInflated;
    }
}
