package project.domain;

public class Employees {
    private final Employee[] employees;
    private final int size;

    public Employees(int size) {
        this.employees = new Employee[size];
        this.size = size;
    }

    public void addEmployee(Employee employee) {
        int firstPosition = -1;
        for (int i = 0; i < employees.length; i++) {
            if (firstPosition == -1 && employees[i] == null) {
                firstPosition = i;
            }
        }
        if (firstPosition == -1) {
            System.out.println("Sorry the array is full");
        } else {
            employees[firstPosition] = employee;
        }
    }

    public void printEmployees() {
        for (var employe : employees) {
            if (employe != null) {
                System.out.println("Book -> " + employe.getTitle());
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    public Employee findByTitle(String title) {
        for (var e : employees) {
            if (e.getTitle().equalsIgnoreCase(title))  {
                return e;
            }
        }
        return null;
    }
}
