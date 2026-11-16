package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Moped slowRide = new Moped();

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor() + " " + slowRide.getFuelCapacity());

        Car car1 = new Car();
        car1.setColor("Gray");
        car1.setFuelCapacity(20);
        car1.setNumberOfPassengers(4);
        System.out.println("My car is " + car1.getColor() + ", it has " + car1.getFuelCapacity() + " fuel capacity"
                + " and there are " + car1.getNumberOfPassengers() + " passengers.");

        Car car2 = new Car("Gray", 4, 200, 25);
        System.out.println("My car is " + car2.getColor() + ", it has " + car2.getFuelCapacity() + " fuel capacity"
                + " and there are " + car2.getNumberOfPassengers() + " passengers." + " The cargo is " + car2.getCargoCapacity()
                + " Kg");

    }
}
