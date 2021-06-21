package cn.itcast.day06.demo01;

/*
* 面向过程：当需要实现一个功能的时候，每一个具体的步骤都需要亲力亲为，详细处理每一个细节。
* 面向对象：当需要实现一个功能的时候，不关系具体的步骤，而是找一个已经具有该功能的人，来帮我做事。*/

import java.util.Arrays;

public class Object {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // 要求打印格式为：[10， 20， 30， 40， 50]
        // 使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println(array[i] + "]");
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println("============================");

        // 使用面向对象
        // 找一个 JDK 给我们提供好的 Arrays 类
        // 其中有一个 toString 方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
