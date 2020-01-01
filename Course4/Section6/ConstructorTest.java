package Course4.Section6;

import java.util.Random;
/**
 * 重载和初始化
 * 当没有构造器时, 会有一个默认的无参构造器. 并且在对象创建时给显示域赋予默认值
 * */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        /**
         * 无论走哪个构造器, 初始化块都会执行内部初始化
         * */
        employees[0] = new Employee("Yang", 4000);
        employees[1] = new Employee(60000);
        employees[2] = new Employee();

        for (Employee e : employees) {
            System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
        }
    }
}

class Employee{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;
    // 静态初始化块
    static {
        Random random = new Random();
        nextId = random.nextInt(10000);
    }
    // 初始化块
    {
        id = nextId;
        nextId++;
    }
    // 构造器1
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    // 构造器2
    public Employee(double s) {
        this("Employee #" + nextId, s);
    }
    // 构造器3
    public Employee() {

    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
}
