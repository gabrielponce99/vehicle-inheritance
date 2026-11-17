package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Moped moped = new Moped("Brown", 2, 50, 5, true);
        System.out.println("Moped: " + moped.getColor() + ", fuel " + moped.getFuelCapacity() + ", kickstand down: "
                + moped.isKickstandDown());

        Car car = new Car("Gray", 4, 200, 25);
        System.out.println("Car: " + car.getColor() + ", it has " + car.getFuelCapacity() + " fuel capacity"
                + " and there are " + car.getNumberOfPassengers() + " passengers.");

        SemiTruck semiTruck = new SemiTruck("Yellow", 2, 200000, 67, true);
        System.out.println("Semi truck: " + semiTruck.getColor() +  ", cargo is " + semiTruck.getCargoCapacity()
                + " Kg, trailer attached: " + semiTruck.isTrailerAttached());

        Hovercraft hovercraft = new Hovercraft("Green", 4, 1000, 50, true);
        System.out.println("Hovercraft: " + hovercraft.getColor() + ", " + hovercraft.getNumberOfPassengers() +
                " passengers, skirt inflated: " + hovercraft.isSkirtInflated());

        //Why can a Moped call setColor() when you never created a Vehicle?
        //Because Moped extends Vehicle, a Moped IS a Vehicle so it takes the public methods from the class.
        //When I make a new Moped(...), the constructor calls the super(...), it constructs the Vehicle part
        //inside the same object. It already lives inside each Moped.
    }
}
