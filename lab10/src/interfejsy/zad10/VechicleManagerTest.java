package interfejsy.zad10;

public class VechicleManagerTest {
    public static void main(String[] args) {
        VechicleManager c1 = new Car();
        VechicleManager m1 = new Motocycle();
        System.out.println(c1.startEngine());
        System.out.println(c1.getFuelLevel());
        System.out.println(m1.startEngine());
        System.out.println(m1.getFuelLevel());
    }
}
