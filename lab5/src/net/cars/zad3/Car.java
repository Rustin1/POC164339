package net.cars.zad3;

class Car{
    String brand;
    String model;
    double productionYear;

    public Car(){

    }

    public Car(String brand, String model){
    this.brand = brand;
    this.model = model;
    }

    public Car(String brand, String model, double productionYear){
    this.brand = brand;
    this.model = model;
    this.productionYear = productionYear;

    }

}

