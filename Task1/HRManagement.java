package lab6.Task1;

import java.util.ArrayList;
import java.util.List;

public class HRManagement {

    private List<Employee> employees;
    public HRManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee == null)
            throw new NullPointerException("Empty object");
        this.employees.add(employee);
    }

    public void listOfEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : employees)
            System.out.println(employee);
    }
    public void searchByName(String name) {
        if (name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        boolean isFound = false;
        System.out.println("The result of search:");
        for (Employee e : employees) {
            if (e.getName().contains(name)) {
                isFound = true;
                System.out.println(e);
            }
        }
        if (!isFound)
            System.out.println("Nothing found");
    }

    public void removeById(int id) {
        employees.remove(getElementIndex(id));
    }

    private int getElementIndex(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return this.employees.indexOf(employee);
        }
        throw new IllegalArgumentException("Invalid id");
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
