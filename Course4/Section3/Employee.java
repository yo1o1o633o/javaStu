package Course4.Section3;

/**
 * 关于静态: 静态常量,静态变量,静态方法
 * 属于类且不属于类对象的变量和函数
 * */
public class Employee {
    public static void main(String[] args) {
        EmployeeClass harry = new EmployeeClass();
        // nextId = 1
        System.out.println(EmployeeClass.getNextId());
        // nextId + 1
        harry.setId();
        // nextId = 2
        System.out.println(EmployeeClass.getNextId());
        // 也可以这样调用静态方法. 但是不建议. 因为该方法的计算与harry没有关系
        // System.out.println(harry.getNextId());
    }
}

class EmployeeClass {
    private int id;
    // 静态变量
    private static int nextId = 1;

    public void setId() {
        id = nextId;
        nextId++;
    }

    // 静态方法不能访问实例域, 即id.  但是可以访问静态域. 即nextId
    public static int getNextId() {
        return nextId;
    }
}
