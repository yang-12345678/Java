package cn.itcast.day04.demo04;

// byte short int long float double char boolean
// String
// println 就是使用了多次重载来实现的
public class OverloadPrint {
    public static void main(String[] args) {
        myPrint(1);
        myPrint((short) 1);
        myPrint((byte) 34);

    }

    public static void myPrint(byte num) {
        System.out.println(num);
    }
    public static void myPrint(short num) {
        System.out.println(num);
    }
    public static void myPrint(int num) {
        System.out.println(num);
    }
    public static void myPrint(long num) {
        System.out.println(num);
    }
    public static void myPrint(float num) {
        System.out.println(num);
    }
    public static void myPrint(double num) {
        System.out.println(num);
    }
    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }
    public static void myPrint(boolean is) {
        System.out.println(is);
    }
    public static void myPrint(String str) {
        System.out.println(str);
    }
}
