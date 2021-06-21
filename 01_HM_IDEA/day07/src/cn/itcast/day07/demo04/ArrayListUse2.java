package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class ArrayListUse2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 向集合中添加元素， add
        // 对于 ArrayList 集合来说，add添加动作一定是成功的，所以返回值可用可不用
        // 但对于其他集合来说，add添加动作不一定成功。
        boolean success = list.add("刘嘉琪");
        list.add("杨鹏宇");
        System.out.println(list);
        System.out.println("添加的动作是否成功:" + success);  // add方法的返回值

        // 从集合中获取元素， get， 索引值从 0 开始
        String name = list.get(0);
        System.out.println("第零号索引位置：" + name);

        // 从集合中删除元素， remove， 索引值从 0 开始
        String whoRemove = list.remove(1);  // 返回被删除位置的元素
        System.out.println("被删除的人是谁：" + whoRemove);
        System.out.println(list);

        // 获取集合的长度，也就是其中数组元素的个数
        int size = list.size();
        System.out.println("数组的长度是：" + size);

    }
}
