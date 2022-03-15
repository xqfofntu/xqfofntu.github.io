package Javalearn;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("小猫", 9000, 1999, 4, 14);
        staff[1] = new Employee("小狗", 8000, 2000, 3, 19);
        staff[2] = new Employee("小狼", 6000, 2003, 9, 24);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name:" + e.getName() + ",salary:" + e.getSalary() + ",hireDay:" + e.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
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

    public void raiseSalary(double byPercent) {     //工资涨百分之几
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}