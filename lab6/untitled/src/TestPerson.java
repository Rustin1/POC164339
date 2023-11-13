import pl.edu.uwm.zad1.Person;

public class TestPerson {
    public static void main(String[] args) {
    Person p1 = new Person(18, "Jan","Kowalski");
    Person p2 = new Person(18, "Jan","Kowalski");
    System.out.println(p1);
    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
    System.out.println(p1.hashCode() == p2.hashCode());
    }
}
