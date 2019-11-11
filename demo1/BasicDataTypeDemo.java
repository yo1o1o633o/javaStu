package demo1;

/**
 * 基本数据类型
 * */
public class BasicDataTypeDemo {
    public static void main(String[] args) {
        // 字节型变量  8位 取值范围 -128~127. 默认0
        byte bByte = 100;
        byte cByte = -100;
        System.out.println(bByte);  // 100
        System.out.println(cByte);  // -100

        // 短整型变量 16位 取值范围 -32768~32767. 默认0
        short bShort = 100;
        short cShort = 10000;
        short dShort = -10000;
        System.out.println(bShort); // 100
        System.out.println(cShort); // 10000
        System.out.println(dShort); // -10000

        // 整型变量 32位 常用 -2,147,483,648~2,147,483,647  . 默认0
        int bInt = 30;
        int cInt = 300000;
        int dInt = 30000000;
        int eInt = -30000000;
        System.out.println(bInt);  // 30
        System.out.println(cInt);  // 300000
        System.out.println(dInt);  // 30000000
        System.out.println(eInt);  // -30000000

        // 长整型变量 64位 -9,223,372,036,854,775,808~9,223,372,036,854,775,807.   默认值是 0L
        Long bLong = 10000000L;
        Long cLong = -10000000L;
        Long dLong = -10000000000000L;
        System.out.println(bLong);  // 10000000
        System.out.println(cLong);  // -10000000
        System.out.println(dLong);  // -10000000000000

        // 单精度浮点数  32位  默认值 0.0f
        float bFloat = 3.1f;
        float cFloat = 3.2223f;
        float dFloat = 3.222333333f;
        float eFloat = 0.9f;
        System.out.println(bFloat); // 3.1
        System.out.println(cFloat); // 3.2223
        System.out.println(dFloat); // 3.2223334    丢失精度,最多保留7位小数精度
        System.out.println(eFloat); // 0.9

        // 双精度浮点数  64位  默认值 0.0d
        double bDouble = 3.111111d;
        double cDouble = 423.22133311233;
        double dDouble = 423.22133311233333333333333333d;
        System.out.println(bDouble);    // 3.111111
        System.out.println(cDouble);    // 423.22133311233
        System.out.println(dDouble);    // 423.22133311233335   14位精度，超过14位小数精度丢失

        // 布尔类型  默认false
        boolean aBoolean = true;
        boolean bBoolean = false;

        // char类型  16位   Unicode字符 \u0000~\uffff  0~65535  默认值 'u0000'
        char aChar = 'a';
        char bChar = '!';
        char cChar = '好';
        char dChar = '1';
        char eChar = ' ';
        char fChar = '\u3333';
        char gChar = '\uff3c';
        System.out.println(aChar);  // a
        System.out.println(bChar);  // !
        System.out.println(cChar);  // 好
        System.out.println(dChar);  // 1
        System.out.println(eChar);  //
        System.out.println(fChar);  // ㌳
        System.out.println(gChar);  // ＼
    }
}
