package Course5.Section7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            String name = "java.lang.Double";
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                // public final
                System.out.println(modifiers + "");
            }
            // class java.lang.Double
            System.out.println("class " + name);
            // 判断是否有非Object类的父类
            if (superCl != null && superCl != Object.class) {
                // extends :java.lang.Number
                System.out.println("extends :" + superCl.getName());
            }

            printConstructors(cl);

            printMethod(cl);

            printFields(cl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 打印所有构造器
    private static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(")");
        }
    }

    // 打印所有方法
    private static void printMethod(Class cl) {
        Method[] methods = cl.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + "  " + name + "(");
            Class[] paramType = m.getParameterTypes();
            for (int i = 0; i < paramType.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramType[i].getName());
            }
            System.out.println(");");
        }
    }

    // 打印所有常量
    private static void printFields(Class cl) {
        Field[] fields = cl.getFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(type.getName() + " " + name + ";");
        }
    }
}
