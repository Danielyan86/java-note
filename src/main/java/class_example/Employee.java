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
        // the value of the name is null
        name = name;  //if the parameter use the same with class var, actual value can't be passed to this function
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
        double raise = salary * byPercent / 100;
        salary = raise;
    }
}
