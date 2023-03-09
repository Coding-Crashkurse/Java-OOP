package org.example;

public class HybridCar extends Car implements Vehicle {

    private Double electricRange;

    public HybridCar(String brand, Double fuel, Double price, Double electricRange) {
        super(brand, fuel, price);
        this.electricRange = electricRange;
    }

    public Double getElectricRange() {
        return electricRange;
    }

    public void setElectricRange(Double electricRange) {
        this.electricRange = electricRange;
    }

    @Override
    public void drive(Integer km) {
        Double fuelConsumptionPer100Km = 5.0;
        Double electricConsumptionPer100Km = 10.0;
        Double fuelRequired = fuelConsumptionPer100Km * km / 100.0;
        Double electricRequired = electricConsumptionPer100Km * km / 100.0;

        if (electricRange >= electricRequired) {
            electricRange -= electricRequired;
            System.out.println("Fahre " + km + " km elektrisch. Es sind noch " + electricRange + " km Reichweite übrig");
        } else if (fuel >= fuelRequired) {
            fuel -= fuelRequired;
            System.out.println("Fahre " + km + " km mit Benzin. Es sind noch " + fuel + " Liter übrig");
        } else {
            System.out.println("Nicht genügend Benzin und Elektrizität für " + km + " km");
        }
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }



}
