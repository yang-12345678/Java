package cn.itcast.day07.demo01;

import java.util.Scanner;

public class ScannerUse {

    public static void main(String[] args) {
        //String str = "123";

        Scanner sc = new Scanner(System.in);  // System.in 代表从键盘输入
        System.out.print("请分别输入一个数字和字符串：");

        // 键盘输入的都是字符串， next 是原样获取
        // 其他中间都包含了类型转换
        int number = sc.nextInt();  // 获取int类型的数字
        String str = sc.next();  // 获取 String 类型的字符串
        System.out.println(number);
        System.out.println(str);
    }
}

/*
* 引用类型的一般使用步骤：
* 1.导包
*   import 路径.类名称
*   如果需要使用的目标类和当前类位于同一个包下，则可以省略导包语句不写
*   只有 java.lang 包下的内容可以不写，其他的包都需要 import 语句
*
* 2.创建
*   类名称 对象名 = new 类名称（）；
*
* 3.使用
*    对象名.成员方法名（）
*
*
* */
