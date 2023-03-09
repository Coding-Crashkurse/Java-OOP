package org.example;

public class Car {

    protected String brand; // Private am Anfang, wegen Inheritance auf private setzen.
    protected Double fuel;
    protected Double price;
    protected static int count = 0;

    public static int getCount() {
        return count;
    }

    Car(String brand, Double fuel, Double price) {
        this.brand = brand;
        this.fuel = fuel;
        this.price = price;
        count++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void drive(Integer km) {
        Double fuelConsumptionPer100Km = 7.0;
        Double fuelRequired = fuelConsumptionPer100Km * km / 100.0;

        if (fuel >= fuelRequired) {
            fuel -= fuelRequired;
            System.out.println("Fahre " + km + " km. Es sind noch " + fuel + " Liter übrig");
        } else {
            System.out.println("Nicht genügend Benzin für " + km + " km");
        }
    }
}
