package Course4.Section8;

/**
 * @author shuai.yang
 * @version 当前版本的描述
 * @since 版本描述 version 1.0
 * */
public class AnnotationTest {
    /**
     * 域注释
     * */
    private static int nextId = 1;

    public static void main(String[] args) throws Exception {
        String fullName = getFullName("O");
        System.out.println(fullName);
    }
    /**
     * @param name 前缀名称
     * @throws Exception 异常处理
     * @return String 全名
     * */
    private static String getFullName(String name) throws Exception {
        try {
            return name + "Yang";
        } catch (Exception e) {
            throw new Exception("异常");
        }
    }

    /**
     * @deprecated 标注不再使用
     * see建立超链接.链接到指定的类
     * @see #getFullName(String)
     * @return int
     * */
    public int getAge() {
        return 30;
    }
}
