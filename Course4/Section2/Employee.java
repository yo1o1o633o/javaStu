package Course4.Section2;

import java.time.LocalDate;

/**
 * 类示例
 * */
public class Employee {
    public static void main(String[] args) {
        EmployeeClass[] staff = new EmployeeClass[3];
        staff[0] = new EmployeeClass("Li", 75000, 1987, 12, 15);
        staff[0] = new EmployeeClass("Yang", 50000, 1987, 12, 21);
        staff[0] = new EmployeeClass("Help", 35000, 1987, 12, 16);

        for (EmployeeClass s : staff) {
            s.raiseSalary(5);
        }
        for (EmployeeClass e : staff) {
            System.out.println("name=" + e.getName());
        }
    }
}


class EmployeeClass {
    private String name;
    private double salary;
    private LocalDate hireDay;
    // 和类名相同, 构造函数
    public EmployeeClass(String n, double s, int year, int month, int day) {
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
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
