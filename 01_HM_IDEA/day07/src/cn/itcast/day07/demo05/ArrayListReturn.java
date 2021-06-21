package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {

    public static void main(String[] args) {
        // 要求：用一个大集合去存入 20 个随机数字，然后筛选集合中的偶数
        //      存入小集合，要求使用自定义的方法
        Random r = new Random();
        ArrayList<Integer> bigList = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(100));
        }
        System.out.println(bigList);

        ArrayList<Integer> smallList = getSmallList(bigList);

        System.out.println("偶数共有" + smallList.size() + "个：");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                smallList.add(list.get(i));
            }
        }

        return smallList;
    }
}
