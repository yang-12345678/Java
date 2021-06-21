package cn.itcast.day07.demo01;

import java.util.Scanner;

public class ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

    }
}
