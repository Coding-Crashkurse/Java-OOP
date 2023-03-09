package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.price = 9999.99;
//        car1.fuel = 100;
//        car1.brand = "Opel";

        Car car1 = new Car("Opel", 100.00, 5999.00);
        System.out.println(car1.getBrand());
        car1.setBrand("Honda");
        System.out.println(car1.getBrand());
//        car1.drive(750);
//        car1.drive(400);
//        car1.drive(400);
//        Car car2 = new Car("Opel", 100.00, 5999.00);
//        Car car3 = new Car("Opel", 100.00, 5999.00);
        Vehicle car2 = new Car("Opel", 100.00, 5999.00);
        Vehicle car3 = new Car("Opel", 100.00, 5999.00);
        System.out.println(Car.getCount());
        Vehicle car4 = new HybridCar("BMW", 100.00, 10000.00, 100.00);
        car4.drive(200);
        car4.drive(1500);
        car4.drive(800);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(car4);

        for (Vehicle vehicle : vehicles) {
            vehicle.drive(200); // ruft hybrid car oder normalen car auf.
        }

    }
}