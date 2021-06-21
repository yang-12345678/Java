package cn.itcast.day05.demo03;

public class ArrayParam {
    // 数组作为函数方法传递
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        printArray(array);
    }
    // 数组名作为方法的参数， 传递的地址，和C语言一样
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
