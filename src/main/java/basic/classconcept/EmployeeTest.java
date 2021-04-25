package basic.classconcept;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee xiaowang = new Employee("xiaowang", 1000, 2020, 1, 1);
//        System.out.println(xiaowang.name);
        System.out.println(xiaowang + " 123");
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("doudou", 10001, 2020, 1, 1);
        staff[1] = new Employee("tiantian", 10001, 2020, 1, 1);
        staff[2] = new Employee("huahua", 10001, 2020, 1, 1);
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay" + e.getHireDay());
        }
    }

}
