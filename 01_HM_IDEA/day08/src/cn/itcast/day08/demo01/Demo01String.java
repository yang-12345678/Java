package cn.itcast.day08.demo01;

public class Demo01String {
    public static void main(String[] args) {
        // 使用空参创造
        String str1 = new String();
        System.out.println("第一个字符串:" + str1);

        // 根据字符数组创建字符串
        char[] charArray = new char[]{'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串:" + str2);

        // 根据字节数组创建字符串
        byte[] byteArray = {65,66,67};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串:" + str3);

        // 直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串:" + str4);
    }
}

/*
* 程序中所有的双引号字符串，都是String类的对象（就算没有 new 也是）
*
* 字符串的特点：
* 1.字符串的内容用不可变
* 2.正是因为字符串不可改变，所以字符串是可以共享使用的。
* 3.字符串效果上相当于 char[]字符数组，但是底层原理是 byte[] 字节数组。
*
* 创建字符串的常见 3+1 种方式
* 三种构造方法：
* public String();  创建一个空白字符串，没有任何内容
* public String(char[] array);  根据字符数组的内容，来创建对应的字符串
* public String(byte[] array);  根据字节数组的内容，来创建对应的字符串
* */
