package Course5.Section3;

import java.util.Objects;

public class ObjectTest {
    private String name;
    private double salary;
    public static void main(String[] args) {
        getHashCode();
        getToString();
    }

    /**
     * 子类equals: 先调用父类equals. 相等后再执行子类equals
     *
     * 1. 显示命名otherObject
     * */
    public boolean equals(Object otherObject) {
        /**
         * 2. this和otherObject引用同一对象
         * */
        if (this == otherObject) {
            return true;
        }
        /**
         * 3. otherObject不能为null
         * */
        if (otherObject == null) {
            return false;
        }
        /**
         * 4. 是否同属同一个类
         * */
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        /**
         * 5. instanceof检测
         * */
        if (!(otherObject instanceof ObjectTest)) {
            return false;
        }
        ObjectTest other = (ObjectTest) otherObject;
        /**
         * Objects.equals 其中一个为null 返回false. 都为null, 返回true. 都不为null 调用name.equals(other.name)
         * 6. 对所有要比较的域进行比较
         * */
        return Objects.equals(name, other.name) && salary == other.salary;
    }

    /**
     * 散列码
     * */
    private static void getHashCode() {
        /**
         * s.hashCode()与t.hashCode()相同. 因为字符串是根据内容计算的
         * sb.hashCode()与tb.hashCode()不同. 是因为StringBuilder没有hashCode方法. 会调用默认的Object类的hashCode. 是对象的存储地址
         * */
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());

        /**
         * 内部会调用Arrays类的hashCode
         * */
        Integer num = Objects.hash(s.hashCode(), t.hashCode());
        System.out.println(num);
    }

    /**
     * toString 返回表示对象值得字符串
     * */
    private static void getToString() {
        Integer x = 10;
        System.out.println(x.toString());
    }
}
