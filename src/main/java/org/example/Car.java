package org.example;

import java.util.*;

public class Car extends Vehicle {
    private String brand;

    public Car(int numOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Car Information - Wheels: " + numOfWheels +
                " - Color: " + color +
                " - Engine Size: " + engineSize +
                " - Fuel Type: " + fuelType +
                " - Brand: " + brand + ".");
    }
}
