package com.pluralsight;

public class SemiTruck extends Vehicle{
    private boolean trailerAttached;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean trailerAttached) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.trailerAttached = trailerAttached;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }
}
