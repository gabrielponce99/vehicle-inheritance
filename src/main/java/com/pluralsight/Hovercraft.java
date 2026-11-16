package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean skirtInflated;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Hovercraft() {
        super();
    }

    public boolean isSkirtInflated() {
        return skirtInflated;
    }


}
