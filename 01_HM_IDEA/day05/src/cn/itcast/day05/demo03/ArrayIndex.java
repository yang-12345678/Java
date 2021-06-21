package cn.itcast.day05.demo03;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15, 25, 35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        // 数组索引越界异常，会报异常
        System.out.println(array[3]);

    }
}
