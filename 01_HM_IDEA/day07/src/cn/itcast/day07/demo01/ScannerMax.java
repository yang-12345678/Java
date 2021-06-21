package cn.itcast.day07.demo01;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int c = sc.nextInt();

        int temp = Math.max(a, b);
        // 条件表达式也行；

        int max = Math.max(temp, c);
        System.out.println("最大值是：" + max);


    }
}
