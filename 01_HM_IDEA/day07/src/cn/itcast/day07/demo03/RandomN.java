package cn.itcast.day07.demo03;

import java.util.Random;

public class RandomN {
    // 要求：根据 int 变量的值，来获取随机数字，范围是[1,n]。

    public static void main(String[] args) {

        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }
    }
}
