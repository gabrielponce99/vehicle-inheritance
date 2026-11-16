package com.pluralsight;

public class SemiTruck extends Vehicle{
    private boolean trailerAttached;

    public SemiTruck() {
        super();
    }

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

}
