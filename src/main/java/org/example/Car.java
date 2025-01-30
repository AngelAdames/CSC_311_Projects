package org.example;

import java.util.*;

public class Car extends Vehicle { // car child class of vehicle
    private String brand;

    public Car(int numOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numOfWheels, color, engineSize, fuelType); // constructor class
        this.brand = brand;
    }

// getter and setter for brand

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // prints out honk text from this method

    public void honk() {
        System.out.println("Honk, honk!");
    }

// prints out information for Car only

    public void displayInfo() {
        System.out.println("Car Information - Wheels: " + numOfWheels +
                " - Color: " + color +
                " - Engine Size: " + engineSize +
                " - Fuel Type: " + fuelType +
                " - Brand: " + brand + ".");
    }
}
