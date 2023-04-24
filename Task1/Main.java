/*Output
List of employees:
Employee{id=1, name='Rysbek', age=20, salary=300.0}

Employee{id=2, name='Ryskul', age=33, salary=800.0}

Employee{id=3, name='Ermek', age=18, salary=500.0}

Employee{id=4, name='Arsen', age=44, salary=950.0}

Employee{id=5, name='Azat', age=22, salary=350.0}

List of employees:
Employee{id=1, name='Rysbek', age=20, salary=300.0}

Employee{id=2, name='Ryskul', age=33, salary=800.0}

Employee{id=3, name='Ermek', age=18, salary=500.0}

Employee{id=5, name='Azat', age=22, salary=350.0}

The result of search:
Employee{id=1, name='Rysbek', age=20, salary=300.0}

Employee{id=2, name='Ryskul', age=33, salary=800.0}
*/

package lab6.Task1;

public class Main {
    public static void main(String[] args) {
        HRManagement hr = new HRManagement();

        Employee employee1 = new Employee();
        employee1.setName("Rysbek");
        employee1.setAge(20);
        employee1.setSalary(300.0);

        Employee employee2 = new Employee();
        employee2.setName("Ryskul");
        employee2.setAge(33);
        employee2.setSalary(800.0);

        Employee employee3 = new Employee();
        employee3.setName("Ermek");
        employee3.setAge(18);
        employee3.setSalary(500.0);

        Employee employee4 = new Employee();
        employee4.setName("Arsen");
        employee4.setAge(44);
        employee4.setSalary(950.0);

        Employee employee5 = new Employee();
        employee5.setName("Azat");
        employee5.setAge(22);
        employee5.setSalary(350.0);

        hr.addEmployee(employee1);
        hr.addEmployee(employee2);
        hr.addEmployee(employee3);
        hr.addEmployee(employee4);
        hr.addEmployee(employee5);
        hr.listOfEmployees();

        hr.removeById(4);
        hr.listOfEmployees();

        hr.searchByName("Rys");

    }
}
