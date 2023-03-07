package org.example;

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
        car1.drive(750);
        car1.drive(400);
        car1.drive(400);


    }
}