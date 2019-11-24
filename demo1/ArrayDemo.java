package demo1;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        fillDemo();
    }

    // 数组定义
    public void initArray() {
        // 数组声明, 以下两种都是声明一个数组,但编程习惯建议使用第一种形式
        String[] array1;
        // String array2[];
        // 声明形式:数组类型[] 变量名;
        String[] stringArray;
        Long[] longArray;
        long[] longArray1;
        Integer[] intArray;
        int[] intArray1;
        Double[] doubleArray;
        double[] doubleArray1;
        Short[] shortArray;
        short[] shortArray1;
        Byte[] byteArray;
        byte[] byteArray1;
        Float[] floatArray;
        float[] floatArray1;
        char[] charArray;

        /**
         * 引申问题
         * 以上定义，Long和long定义的区别
         * 1. long是基本数据类型， Long是对象类型，也就是long的包装类。  long没有属性和方法，Long有属性和方法
         * 2. Long定义的变量是一个Long类型的对象。  long定义的变量是一个长整型的数值变量
         * 3. 有时候运算必须是两个对象间进行， 不允许对象和数字之间的运算（如相等）。所以用一个对象把数字进行封装。这样可以和一个对象进行比较
         * */
    }

    // 数组创建
    public void createArray() {
        // 数组创建.创建形式： 数据类型[] 数组变量名 = new 数据类型[数组长度];     // 数组长度必须指定
        String[] students = new String[15];
        // 创建一个10长度的整型数组
        Integer[] nums = new Integer[10];
        // 给数组每个元素赋值下标加5
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 5;
        }
        // 循环输出
        /**
         * 引申问题
         * java5新的循环方式。不需要指定下边即可遍历数组
         * */
        for (Integer num : nums) {
            System.out.println(num);
        }

        // 多维数组
        String[][] str = new String[3][4];
        for (String[] first : str) {
            for (String two : first) {
                System.out.println(two);
            }
        }
        System.out.println(str[1][2]);
    }

    /**
     * Arrays工具类使用
     */
    // 用二分查找法在给定的数组中搜索给定值的对象. 如果存在返回索引,不存在返回-1或-插入点
    private static void binarySearchDemo() {
        // 注意： 1. 使用前数组必须排序好. 2. 如果有多个相同元素,无法准确获取
        String[] str = new String[2];
        str[0] = "Yang";
        str[1] = "Li";
        Arrays.sort(str);
        for (String s : str) {
            System.out.println(s);
        }
        Integer liIndex = Arrays.binarySearch(str, "Li");     // 1
        System.out.println("Li的索引" + liIndex);
        Integer yangIndex = Arrays.binarySearch(str, "Yang"); // 0
        System.out.println("Yang的索引" + yangIndex);
        Integer xIndex = Arrays.binarySearch(str, "x");       // -3
        System.out.println("x的索引" + xIndex);
        /**
         * 关于没有找到，返回对应插入点的分析
         * 插入点： 即如果将要查找的元素放入到数组中，应该放置的位置索引。
         * 即：x没找到， 如果x在数组中应该排在Yang后边。 而插入点的索引是从1开始记录。 即插入点为3. 连接-符号
         * */
    }

    // 比较两个数组是否相等
    private static void equalsDemo() {
        // 数组相等条件： 元素相同, 顺序相同
        Integer[] arr1 = new Integer[3];
        arr1[0] = 3;
        arr1[1] = 5;
        arr1[2] = 1;
        System.out.println("数组1：" + Arrays.toString(arr1));
        Integer[] arr2 = new Integer[3];
        arr2[0] = 5;
        arr2[1] = 3;
        arr2[2] = 1;
        System.out.println("数组2：" + Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("数组相等");
        } else {
            System.out.println("数组不等");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // 排序后两个数组相等
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("数组相等");
        } else {
            System.out.println("数组不等");
        }
    }

    // 给数组每个元素赋值
    private static void fillDemo() {
        Integer[] arr = new Integer[10];
        // 用100填充数组每个元素
        Arrays.fill(arr, 100);
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
