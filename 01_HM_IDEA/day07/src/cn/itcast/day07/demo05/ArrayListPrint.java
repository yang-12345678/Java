package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class ArrayListPrint {

    public static void main(String[] args) {
        // 要求：定义以指定格式打印集合的方法 （ArrayList 类型作为参数），使用{}括上集合
        //     使用 @ 分隔每个元素，格式参照（元素 @ 元素 @ 元素）
        ArrayList<String> list = new ArrayList<>();
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        list.add("张三丰");

        System.out.println(list);

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
