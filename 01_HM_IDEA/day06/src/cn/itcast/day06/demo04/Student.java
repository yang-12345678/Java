package cn.itcast.day06.demo04;

public class Student {
    private String name;
    private int age;

    // 用来创建对象
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /*public Student(){

    }*/
}
/*
 * 构造方法：专门用来创建对象的方法，当用 new 关键字创建对象时，其实就是在调用构造方法
 *
 * 格式：  public 类名称 （参数类型 参数名称）{
 *         方法体；
 *      }
 *
 * 注意事项：
 * 1.构造方法的名称必须和所在的类名称完全一样，大小写也一样
 * 2.构造方法不要写返回值类型， void 也不写
 * 3.构造方法不能 return 一个具体的返回值
 * 4.如果没有编写任何的构造方法，那么编译器将会默认赠送一个构造方法，没有参数，方法体为空。
 * 5.构造方法也是可以进行重载的：名称相同，参数不同
 * */