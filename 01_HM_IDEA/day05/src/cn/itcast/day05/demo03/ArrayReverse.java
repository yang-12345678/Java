package cn.itcast.day05.demo03;

public class ArrayReverse {
    public static void main(String[] args) {
        // 要求:将一个数组反转，且不能使用新数组。
        int[] array = {10, 20, 30, 40};

        // 遍历打印数组原来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 反转数组
        for (int i = 0; i < array.length / 2; i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // 输出反转后的数组
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }


    }
}