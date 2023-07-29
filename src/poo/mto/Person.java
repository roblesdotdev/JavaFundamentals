package poo.mto;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;

    public Person() {}

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("Person(%s, %s)", firstname, lastname);
    }

    @Override
    public boolean equals(Object o) {
        // same obj in memory
        if (this == o) return true;
        // is null or not same class
        if (o == null || getClass() != o.getClass()) return false;
        // compare firstname && lastname
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
