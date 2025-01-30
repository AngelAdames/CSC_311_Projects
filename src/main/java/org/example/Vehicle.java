package org.example;

import java.util.*;

public class Vehicle { // setting up class with variables
    protected int numOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    public Vehicle(int numOfWheels, String color, float engineSize, String fuelType) { // constructor class {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
// getters and setters for each variable

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
// this prints out all information for Vehicles class only
    public void displayInfo() {
        System.out.println("Vehicle Information - Wheels: " + numOfWheels +
                " - Color: " + color +
                " - Engine Size: " + engineSize +
                " - Fuel Type: " + fuelType + ".");
    }
}
