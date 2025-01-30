package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(8, "white", 10.8F, "gas");
        Car car = new Car(4, "gray", 6.6F, "electric", "Lexus");

        vehicle.displayInfo();
        car.displayInfo();
        }
    }