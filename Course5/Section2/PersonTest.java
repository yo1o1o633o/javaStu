package Course5.Section2;

public class PersonTest {
    public static void main(String[] args) {
        // 抽象类不能new对象
        // Person p = new Person();

        // 这里就是用抽象类对象变量接收子类对象
        Person[] people = new Person[2];
        people[0] = new Employee("Yang", 3000, 2019, 5, 12);
        people[1] = new Student("Kile", "First");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
