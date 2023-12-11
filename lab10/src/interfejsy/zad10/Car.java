package interfejsy.zad10;

public class Car implements VechicleManager{
    @Override
    public String startEngine() {
        return "Silnik auta jest włączony wrumm wruuum";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}
