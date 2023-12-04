package org.mammalia.species;

public class TestMammal {
    public static void main(String[] args) {
        Mammal m1 = new Mammal();
        Mammal m2 = new Mammal("kot","biały",true);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.species());
        System.out.println(m2.furColor());
        System.out.println(m1.isDomesticated());
        System.out.println(m1.equals(m2));
        System.out.println(m2.hashCode() == m1.hashCode());
    }
}
