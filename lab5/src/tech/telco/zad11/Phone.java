package tech.telco.zad11;

class Phone {
    String manufacturer;
    String model;
    String operatingSystem;

    {
        operatingSystem = "Android";
    }


    public Phone(String manufacturer, String model){
    this.manufacturer = manufacturer;
    this.model = model;
    this.operatingSystem = "IOS";


    }
}