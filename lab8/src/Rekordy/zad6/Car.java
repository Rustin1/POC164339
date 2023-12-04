package Rekordy.zad6;

public record Car(String brand, String model, double fuelConsuptionPer100km) {
    public double fuelCost(double fuelPrice, double distance){
        double fuelCost = (fuelPrice*distance)/fuelConsuptionPer100km;
        return  fuelCost;
    }
}
