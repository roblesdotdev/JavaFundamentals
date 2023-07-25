package classes;

public class ClassesDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setFirstname("John");
        e1.setLastname("Doe");

        System.out.println(e1);

        Employee e2 = new Employee();
        e2.setFirstname("Mary");
        e2.setLastname("Jane");

        System.out.println(e2);

        Department d1 = new Department("Data", "John Doe");
        System.out.println(d1.name());
        System.out.println(d1.managerName());
    }
}
