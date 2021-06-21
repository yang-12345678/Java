package cn.itcast.day05.demo01;

/*
 * 数组：是一种容器，可以同时存放多个数据值
 *
 * 数组的特点：
 * 1.数组是一种引用数据类型
 * 2.数组当中的多个数据，类型必须统一
 * 3.数组的长度在程序运行期间不可改变
 *
 * 数组的初始化：在内存中创建一个数组，并且向其中赋予一些默认值。
 *
 * 两种常见的初始化方式：
 * 1.动态初始化(指定长度)
 *
 *   数据类型[] 数组名称 = new 数据类型[数组长度];  // new 代表创建数组的动作
 *
 * 2.静态初始化(指定内容）
 *
 *   数据类型[] 数组名称 = new 数据类型[] {元素1， 元素2， ...}
 *
 * 注意事项：无论哪种方式创建，数组是一定有长度的，静态创建时元素个数就是长度，Java会自动推算
 *
 * )*/

public class Array {
    public static void main(String[] args) {
        // 动态创建一个数组，存int类型300个
        int[] array = new int[300];
        array[0] = 1;
        System.out.println(array[0]);

        // 静态创建一个数组
        int[] array1 = new int[]{1, 2, 3, 4};
        String[] array2 = new String[]{"hello", "world"};

    }
}








