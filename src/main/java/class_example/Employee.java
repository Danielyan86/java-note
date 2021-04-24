package class_example;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public String toString() {
        System.out.println(name);
        return name;
    }

    public Employee(String name, double s, int year, int month, int day) {
        // if we want to assign the name value to instant value name, it should be write as this.name=name
        name = name;  //if the function parameter name is the same with class name, the class var is override
        System.out.println(name);
        salary = s; //if the variable in function is not defined, it will use the class var as default value
        hireDay = LocalDate.of(year, month, day);

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        salary = salary * byPercent / 100;
    }
}
