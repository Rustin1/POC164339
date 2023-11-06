package pl.weather.zad23;

import java.util.ArrayList;

class TemperatureHistory {
    private ArrayList<Double> temperatures = new ArrayList<Double>();


    public TemperatureHistory() {

    }
    //getters

    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }
    //setters

    public void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void addTemperature(double temperature) {
        this.temperatures.add(temperature);
    }

    public void removeTemperature(int index) {
        this.temperatures.remove(index);
    }

    public double averageTemperature() {
        double temp = 0;
        int count = this.temperatures.size();
        for (int i = 0; i == this.temperatures.size(); i++) {
            temp = temp + this.temperatures.get(i);
        }
        temp = temp/count;
        return temp;
    }

}


