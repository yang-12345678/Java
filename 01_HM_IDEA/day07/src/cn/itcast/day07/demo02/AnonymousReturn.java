package cn.itcast.day07.demo02;

import java.util.Scanner;

public class AnonymousReturn {

    public static void main(String[] args) {

        // 匿名对象的方式使用 Scanner
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);


//         使用匿名对象进行传参
        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void methodParam(Scanner sc) {
        // 匿名对象作为方法的参数
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
