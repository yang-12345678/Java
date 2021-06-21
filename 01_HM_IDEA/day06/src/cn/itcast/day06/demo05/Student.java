package cn.itcast.day06.demo05;

public class Student {
    // 成员变量
    private String name;
    private int age;

    // 无参数的构造方法
    public Student() {
    }

    // 全参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter/Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

/*
* 标准类的组成：
* 1.所有的成员变量都要使用 private 关键字修饰
* 2.为每一个成员变量编写一对 Getter/Setter 方法
* 3.编写一个无参数的构造方法
* 4.编写一个全参数的构造方法
*
* 标准类也叫做， Java Bean*/

