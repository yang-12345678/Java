package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("杨鹏宇");
        list.add("刘漂");
        list.add("刘嘉琪");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
