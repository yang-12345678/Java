package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListCun {

    public static void main(String[] args) {
        // 要求：生成6个 1-33 之间的整数，添加到集合，并遍历集合
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33);
            list.add(num);
        }

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
