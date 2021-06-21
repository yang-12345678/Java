package cn.itcast.day06.demo04;

public class StudentUse {
    public static void main(String[] args) {
        // 类似 python 中的 __init__() 方法
        // java中须手动定义，创建对象时自动执行
        Student stu = new Student("刘嘉琪",20);
        System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge());
    }
}
