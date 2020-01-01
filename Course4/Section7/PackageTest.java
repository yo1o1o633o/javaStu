package Course4.Section7;

// 导入要调用的包. 以下写法都可以
//import Course4.Section7.com.horstman.corejava.Employee;
import Course4.Section7.com.horstman.corejava.*;
// 导入系统包
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Yang", 3000, 1982, 12, 25);
        employee.raiseSalary(10);
        // 不需要System,是因为上面用import导入了这个包
        out.println("name=" + employee.getName() + ", salary=" + employee.getSalary() + ", Date=" + employee.getHireDay());
    }
}
