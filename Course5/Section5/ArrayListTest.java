package Course5.Section5;

import Course5.Section4.Employee;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Yang", 2000, 1700, 10, 15));
        employees.add(new Employee("Li", 3000, 1700, 10, 15));

        // 将数组列表的存储容量消减到当前尺寸
        employees.trimToSize();

        // 元素数量
        System.out.println(employees.size());

        // set替换数组元素
        employees.set(1, new Employee("替换", 3300, 1902, 9, 10));
        for (Employee e : employees) {
            e.raiseSalary(5);
        }

        for (Employee e : employees) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }

        // 计算可变入参的值
        doubleMax(1.2, 3.44);
        doubleMax(3.1, 2.3, 9.6);
    }

    // double... nums 即 double[]
    public static double doubleMax(double... nums) {
        double max = 0;
        for (double num : nums) {
            max += num;
        }
        return max;
    }
}
