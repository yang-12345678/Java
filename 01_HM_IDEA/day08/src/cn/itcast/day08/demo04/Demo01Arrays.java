package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArrays = {10, 20,30};

        // 将 int[] 数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArrays);
        System.out.println(intStr);

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb", "ccc", "aaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

}

/*
* java.util.Arrays 是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常用操作。
*
* public static String toString(数组);将参数数组变成字符串（按照默认格式，[元素1，元素2，...]）
*
* public static void sort(数组); 按默认升序对数组的元素进行排序
*
* 备注：
* 1.如果是数值，sort 默认按照升序从小到大
* 2.如果是字符串， sort 默认按照字母升序
* 3.如果是自定义的类型，那么这个自定义的类需要有 Comparable 或者 Comparator 接口的支持
*
* */
