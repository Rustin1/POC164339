package pl.edu.uwm.zad1;

import java.util.Objects;

public class Person {

    private int age;
    private String FirstName;
    private String LastName;

    public Person (int age, String FirstName, String LastName ) {
        this.age = (age < 0) ? 0 : age;
        this.FirstName = (FirstName == null || FirstName.isEmpty()) ? "" : FirstName;
        this.LastName = (LastName == null || LastName.isEmpty()) ? "" : LastName;
    }
    //getters


    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getAge() {
        return age;
    }

    //setters


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        if (age <0)
            this.age = 0;
    }

    @Override
    public String toString() {
        return "Person: " + FirstName +" "+ LastName +", Age: "+ age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getFirstName(), getLastName());
    }
}
