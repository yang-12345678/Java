package cn.itcast.day07.demo03;

import java.util.Random;

public class RandomUse {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是" + num);  // 在 int 范围内产生随机数

        // nextInt() 方法的重载形式，参数代表了范围（左闭右开区间）
        int a = r.nextInt(10);  // [0, 10) 取不到10
        System.out.println(a);
    }
}

/*
* Random类：用来产生随机数字*/