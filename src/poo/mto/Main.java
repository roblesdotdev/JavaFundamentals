package poo.mto;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe");

        // toString
        System.out.println(p1);

        Person p2 = new Person("John", "Doe");

        // equals && hasCode
        System.out.println(p1.equals(p2));
    }
}
