package interfejsy.zad10;

public class Motocycle implements VechicleManager{
    @Override
    public String startEngine() {
        return "Silnik motocykla jest włączony wrutututu";
    }

    @Override
    public int getFuelLevel() {
        return 30;
    }
}
