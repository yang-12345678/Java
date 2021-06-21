package cn.itcast.day06.demo03;

public class Person {
    String name;
    private int age;

//    name = "liujiaqi";  // JAVA中所有的除定义或声明语句之外的任何语句都必须在方法内部

    public void show() {
        System.out.println("我叫" + name + ",年龄" + age);
    }

    // 该成员方法，专门用于向 age 设置数据，方法名： set + Age   （成员变量名首字母大写)
    public void setAge(int num) {
        // 有参数无返回值
        if (num < 100 && num >= 0)
            age = num;
        else
            System.out.println("数据不合理！");
    }

    // 该成员方法，专门用于获得 age 的数据
    public int getAge() {
        // 无参数有返回值
        return age;
    }
}

/*
 * 间接访问成员变量， 就是定义一对  Getter/Setter
 * 想往里放用set
 * 想往外拿用get 方法*/