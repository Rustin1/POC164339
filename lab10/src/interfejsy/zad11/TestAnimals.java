package interfejsy.zad11;

public class TestAnimals {
    public static void main(String[] args) {
        DomesticAnimalSound d1 = new Dog();
        System.out.println(d1.makeSound());
        System.out.println(d1.makeHappySound());
    }
}
