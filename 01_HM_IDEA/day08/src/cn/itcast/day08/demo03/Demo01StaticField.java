package cn.itcast.day08.demo03;

public class Demo01StaticField {

    // static 关键字用来修饰成员变量的情况
    public static void main(String[] args) {
        Demo02StaticStudent one = new Demo02StaticStudent("郭靖", 19);
        one.room = "101教室";  // static 成员变量，推荐使用 类名称.成员变量调用
        Demo02StaticStudent two = new Demo02StaticStudent("刘嘉琪", 19);
        System.out.println("姓名," + one.getName() +
                ",年龄," + one.getAge() + ",教室," + one.room +
                ",学号," + one.getId());
        System.out.println("姓名," + two.getName() +
                ",年龄," + two.getAge() + ",教室," + two.room +
                ",学号," + two.getId());

    }
}

/*
 * 如果一个成员变量使用了 static 关键字，那么这个成员变量不在属于对象自己
 * 而是多个对象共享同一份数据。*/