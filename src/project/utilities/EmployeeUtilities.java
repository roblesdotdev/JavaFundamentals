package project.utilities;

import project.domain.Employee;
import project.domain.Employees;

public class EmployeeUtilities {
    public static boolean employeeExists(Employees employees, Employee employee) {
        return employees.findByTitle(employee.getTitle()) != null;
    }
}
