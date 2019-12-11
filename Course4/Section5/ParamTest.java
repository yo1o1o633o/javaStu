package Course4.Section5;

public class ParamTest {
    public static void main(String[] args) {
        /**
         * Test1. 按值传递, percent的值不会改变
         * */
        System.out.println("tripleValue: ");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(10);
        System.out.println("After: percent=" + percent);

        /**
         * Test2 引用了这个对象可以改变值
         * */
        System.out.println("tripleSalary: ");
        Employee happy = new Employee("Yang", 100000);
        System.out.println("Before: salary=" + happy.getSalary());
        tripleSalary(happy);
        System.out.println("After: salary=" + happy.getSalary());

        /**
         * Test3  交换不会改变值
         * */
        System.out.println("Swap: ");
        Employee a = new Employee("AA", 2100);
        Employee b = new Employee("BB", 3200);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End: x=" + x);
    }
    public static void tripleSalary(Employee e) {
        e.raiseSalary(200);
        // e和happy同时引用了这个对象.当e调用修改方法时, happy对象也被修改
        System.out.println("End: salary=" + e.getSalary());
    }
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("Before: x=" + x.getName());
        System.out.println("Before: y=" + y.getName());
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}