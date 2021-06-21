package cn.itcast.day06.demo01;


public class StudentUse {
    public static void main(String[] args) {
        // 1.导包
        // 因为Student类和本程序位于同一个包下，省略导包语句不写

        // 2.创建
        Student stu = new Student(); // 创建了一个Student类对象

        // 3.使用
        stu.name = "刘嘉琪";
        stu.age = 20;
        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();
        stu.study();
    }
}

/*
 * 通常情况下，一个类不能够直接使用，需要根据类创建一个对象，才能使用。
 * 使用步骤：
 * 1.导包： 指出是什么类，在什么位置
 * import 包名称.类名称；
 * import cn.itcast.day01.demo01.Student;
 * 对于和当前类属于同一个包的情况，也可以省略导包语句不写
 *
 * 2.创建
 * 类名称 对象名 = new 类名称();
 * Student stu = new Student();
 *
 * 3.使用
 * 使用成员变量， 对象名.成员变量名
 * 使用成员方法， 对象名.成员方法名(参数)
 *
 * 注意事项：
 * 如果成员变量没有赋值的话，将和数组一样，有一个默认值，规则一致
 * */