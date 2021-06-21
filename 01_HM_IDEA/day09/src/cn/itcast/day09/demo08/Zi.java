package cn.itcast.day09.demo08;

public class Zi extends Fu {

    int num = 20;

    public Zi() {
        super();  // 在子类的构造方法中，访问父类的构造方法
    }

    public void methodZi() {
        System.out.println(super.num);  // 在子类的成员方法中，访问父类的成员变量
    }

    public void method() {
        super.method();  // 在子类的成员方法中，访问父类的成员方法
        System.out.println("子类方法");
    }
}

/*
 * super 关键字的用法有三种：
 * 1.在子类的成员方法中，访问父类的成员变量
 * 2.在子类的成员方法中，访问父类的成员方法
 * 3.在子类的构造方法中，访问父类的构造方法
 * */
