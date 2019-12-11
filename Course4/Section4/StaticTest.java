package Course4.Section4;

/**
 * 静态: 完成示例
 * */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Peter", 12000);
        staff[1] = new Employee("BoBo", 3560);
        staff[2] = new Employee("Kelly", 7820);

        for (Employee s : staff) {
            s.setId();
            System.out.println("name=" + s.getName() + ", id=" + s.getId() + ", salary=" + s.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println(n);
    }
}


class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setId() {
        id = nextId;
        nextId++;
    }
    public static int getNextId() {
        return nextId;
    }

    // 每个类都可以有main方法. 可以独立的测试当前类
    public static void main(String[] args) {
        Employee e = new Employee("Hello", 1200);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}