package lab6.Task1;

public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private Double salary;

    public Employee() {
        this.id = IdProvider.getInstance().getUniqueId();
    }

    public Employee(String name, Integer age, Double salary) {
        this.id = IdProvider.getInstance().getUniqueId();
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 18)
            throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Invalid salary");
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + '\n';
    }
}
