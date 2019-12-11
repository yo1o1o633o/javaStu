package Course4.Section2;

import java.time.LocalDate;

/**
 * 类示例
 * */
// 一个源文件只能有一个共有类. 即public修饰. 如果给EmployeeClass类加public 就会报错
public class Employee {
    public static void main(String[] args) {
        // 创建一个EmployeeClass类类型数组,长度3
        EmployeeClass[] staff = new EmployeeClass[3];
        // 分别创建对象并赋值到数组中
        staff[0] = new EmployeeClass("Li", 75000, 1987, 12, 15);
        staff[1] = new EmployeeClass("Yang", 50000, 1987, 12, 21);
        staff[2] = new EmployeeClass("Help", 35000, 1987, 12, 16);

        // 循环调用类方法
        for (EmployeeClass s : staff) {
            s.raiseSalary(5);
        }
        for (EmployeeClass e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}


class EmployeeClass {
    // private意义: 这个参数只能是该类的对象进行操作. 这个例子中salary的值只能获取. 或者通过这个类的方法raiseSalary来设置.
    // name 在构造器中设置后, 就不会再改变. 没有提供对这个值的修改方法. 那么只要构造时初始化了,就再也不会被改变
    private final String name;
    private double salary;
    private LocalDate hireDay;
    // 和类名相同, 构造函数
    public EmployeeClass(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return doubleName(name);
    }

    // name为final修饰. 当对象构造之后无法对其进行赋值
    // public void setName(String newName) {
    //      name = newName;
    // }

    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    // 此处方法只有1个入参. 叫做显示参数. 实际还有一个隐式参数 用关键字this表示
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        // 也可以写成这样this. 可以很好区分实例域和局部变量
        // double raise = this.salary * byPercent / 100;
        salary += raise;
    }

    // 私有方法: 当此方法只在当前类内使用时.设为私有.当业务复杂时,没有用处的私有方法可以放心的删除, 而公有方法, 就要考虑其他业务调用问题而不能轻易改动
    private String doubleName(String name) {
        name = name + "!";
        return name;
    }
}
