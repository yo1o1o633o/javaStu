package Course5.Section9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopy(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Yi", "Li", "Yang"};
        b = (String[]) goodCopy(b, 10);
        System.out.println(Arrays.toString(b));

        b = (String[]) badCopy(b, 10);
    }

    public static Object[] badCopy(Object[] obj, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(obj, 0, newArray, 0, Math.min(obj.length, newLength));
        return newArray;
    }

    public static Object goodCopy(Object obj, int newLength) {
        Class cl = obj.getClass();
        if (!cl.isArray()) {
            return null;
        }
        Class componentType = cl.getComponentType();
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(obj, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
