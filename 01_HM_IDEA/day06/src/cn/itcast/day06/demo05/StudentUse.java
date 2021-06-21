package cn.itcast.day06.demo05;

public class StudentUse {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("刘嘉琪");
        stu.setAge(20);
        System.out.println("姓名," + stu.getName() + "年龄," + stu.getAge());

        Student stu1 = new Student("杨鹏宇", 21);
        System.out.println("姓名," + stu1.getName() + "年龄," + stu1.getAge());

    }
}
