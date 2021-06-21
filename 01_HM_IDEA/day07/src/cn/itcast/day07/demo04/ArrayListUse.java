package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class ArrayListUse {

    public static void main(String[] args) {
        // 从 JDK1.7 开始，右侧的尖括号可以不写内容，但是尖括号不能省
        // 左边的一定要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("刘嘉琪");
        System.out.println(list);
        list.add("杨鹏宇");
    }
}

/*
* 数组的长度不可以发生改变，但是 ArrayList 集合的长度是可以随意变化的
*
* 对于 ArrayList 来说，有一个间括号 <E> 代表泛型
* 泛型：装在集合中的所有元素，全都是统一的什么类型
* 注意：泛型只能是引用类型，不能是普通类型
*
* 注意事项：
* 对于 ArrayList 集合来说，直接打印得到的不是地址值，而是内容。
* 如果内容是空，得到的是空的中括号： []
* */