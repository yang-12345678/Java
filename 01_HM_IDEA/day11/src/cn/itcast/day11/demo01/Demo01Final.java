package cn.itcast.day11.demo01;

public class Demo01Final {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        // 一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        // 一次赋值，终身不变
        final int num1 = 10;
        System.out.println(num1);
//        num1 = 11;
//        num1 = 10;

        final int num2;
        // 只要保证有唯一一赋值即可
        num2 = 10;

        // 对于基本数据类型来说，不可变是说变量当中的数据不可改变
        // 对于引用数据类型来说，不可变是说变量当中的地址值不可改变
        Student stu1 = new Student("刘嘉琪");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("杨鹏宇");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("00");
        System.out.println(stu2.getName());
//        stu2 = new cn.itcast.day10.demo01.Student();
        stu2.setName("111");
        System.out.println(stu2.getName());

        System.out.println((new Student()).getName());
        System.out.println((new Student()).getAge());
    }

}

/*
final关键字代表最终、不可改变的

常见的四种用法：
1. 可以用来修饰一个类
2. 可以用来修饰一个方法
3. 可以用来修饰一个局部变量
4. 可以用来修饰一个成员变量
 */