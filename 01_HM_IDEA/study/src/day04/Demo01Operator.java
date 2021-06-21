package day04;

// 类似C语言的运算符

public class Demo01Operator {
    public static void main(String[] args) {
        System.out.println(20 + 30);

        int a = 20, b = 30;
        System.out.println(a - b);

        // 整数 / 整数 == 整数
        int result = a / b;
        System.out.println(result);

        // String 注意大小写，用于声明字符串， 但他并不是关键字
        String str1 = "Hello";
        System.out.println(str1 + "World");

        // 任何数据类型与字符串 + 连接时， 结果都会变成字符串
        System.out.println(str1 + 20);

        // 优先级相同时 + 左结合，  加上圆括号会出现40， 小括号优先于一切
        System.out.println(str1 + 20 + 20);


    }
}
