package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class ArrayListStudent {

    public static void main(String[] args) {
        // 要求：自定义 4 个学生对象，添加到集合，并遍历
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("刘嘉琪", 20);
        Student two = new Student("杨鹏宇", 20);
        Student three = new Student("刘漂", 20);
        Student four = new Student("汤中文", 20);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName());
            System.out.println("年龄：" + list.get(i).getAge());
        }
    }

}
