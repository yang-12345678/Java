package cn.itcast.day05.demo03;

/*
* 数组必须进行 new 初始化才能使用其中的元素。
* 如果只是赋值了一个 null ，没有进行new创建
* 那么就会发生空指针异常： NullPointerException*/

public class ArrayNull {
    public static void main(String[] args) {
//        int[] array;  // 报错，因为没有new
        int[] array = null;
        System.out.println(array[0]);
    }
}
