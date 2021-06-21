package cn.itcast.day05.demo02;

public class ArraySame {
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
        // 将 arrayA 的地址值赋给 arrayB ，即两个数组名指向同一个地址，共用一块内存
        int[] arrayB = arrayA;
        System.out.println(arrayB);  // 地址值
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        // 改变数组中的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);  // 地址值
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
    }
}
