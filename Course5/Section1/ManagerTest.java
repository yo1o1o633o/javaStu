package Course5.Section1;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Yang", 12000, 2019, 12, 25);
        manager.setBonus(2000);

        Employee[] employees = new Employee[3];

        employees[0] = manager;
        employees[1] = new Manager("Link", 30000, 2018, 11, 2);
        employees[2] = new Manager("Kind", 3400, 1990, 7, 18);

        for (Employee e : employees) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }

        Manager Children = new Manager("Children", 10000, 2019, 10, 20);
        Employee Parent = new Employee("Parent", 10000, 2019, 10, 20);
        /**
         * 父类对象变量即可以已用父类对象也可以引用子类对象. 但是子类对象变量只能引用子类对象
         * */
        Parent = Children;
        Manager Children1;
        /**
         * instanceof判断是否可转换
         * */
        if (Parent instanceof Manager) {
            // Children = Parent;  // 报错
            /**
             * 父类对象强制转换成子类对象类型. 就可以用子类变量已用了
             * */
            Children1 = (Manager) Parent;
        }
    }
}
