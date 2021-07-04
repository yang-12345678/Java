package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> addName(List<String> list) {
        list.add("1");
        list.add("2");
        list.add("3");
        return list;
    }
}
/*
java.util.List 正是ArrayList所实现的接口
 */
