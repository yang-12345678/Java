package cn.itcast.day05.demo03;

public class ArrayReturn {
    public static void main(String[] args) {
        // 接收数组的地址 和 方法中的数组地址一样
        int[] result = calculate(10, 20, 30);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = new int[3];
        array[0] = sum;
        array[1] = avg;
        return array;  // 返回的是数组的地址
    }
}
