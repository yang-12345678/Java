package cn.itcast.day09.demo07;

public class Demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();

    }

}

/*
* 继承关系中，父子类构造方法的访问特点：
*
* 1.子类构造方法当中有一个默认隐含的 "super()" 调用，所以先调用父类构造
* 2.子类构造可以通过 super 关键字调用父类重载构造
* 3.super 的父类构造调用，必须是子类构造方法的第一个语句
*   且只有子类构造可以调用父类构造，且只能调用一种重载形式
* 4.子类必须调用父类构造方法
* */