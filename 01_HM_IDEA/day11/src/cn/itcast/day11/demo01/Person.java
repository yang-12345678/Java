package cn.itcast.day11.demo01;/*
对于成员变量来说，如果使用final关键字修饰，那么这个变量也是不可改变

1. 由于成员变量具有默认值，所以用了final关键字后必须手动赋值，不会再给默认值了
2. 对于final的成员变量，要么使用直接赋值，要么使用构造方法赋值.二者选其一
3. 必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
 */

public class Person {
    private final String name /*= "000"*/;

//    public Person() {
//    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
