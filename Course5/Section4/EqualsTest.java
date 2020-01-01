package Course5.Section4;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Yang", 75000, 1800, 2, 10);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Kid", 75000, 1800, 2, 10);
        Employee bob = new Employee("Bob", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(Bob): " + alice1.equals(bob));
        System.out.println("bob.toString: " + bob.toString());

        Manager carl = new Manager("Carl", 8000, 1990, 2, 10);
        Manager boss = new Manager("Carl", 8000, 1990, 2, 10);
        boss.setBonus(5000);
        System.out.println("boss.toString: " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("boss.hashCode(): " + boss.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
