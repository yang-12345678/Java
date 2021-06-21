package cn.itcast.day05.demo02;

public class ArrayTwo {
    public static void main(String[] args) {
        int[] arrayA = new int[3];  // 动态初始化
        System.out.println(arrayA);  // 地址值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        // 改变数组中的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);  // 地址值
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);


        // ========================================
        // 此时两个数组是完全独立的，内存地址不相同
        int[] arrayB= new int[3];  // 动态初始化
        System.out.println(arrayB);  // 地址值
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        // 改变数组中的内容
        arrayB[1] = 10;
        arrayB[2] = 20;
        System.out.println(arrayB);  // 地址值
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}
