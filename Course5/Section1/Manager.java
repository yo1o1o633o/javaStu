package Course5.Section1;

public class Manager extends Employee {
    private double bonus;
    /**
     * 当前父类没有不带参数的构造器, 继承时子类也要显式调用父类的其他构造器. 下边代码不写编译报错
     * */
    public Manager(String name, double salary, int year, int month, int day) {
        // 调用父类构造器的语句一定要在构造器的第一行
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        // 子类的方法调用不到父类的私有变量. 所以使用super调用父类公共方法获取
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
