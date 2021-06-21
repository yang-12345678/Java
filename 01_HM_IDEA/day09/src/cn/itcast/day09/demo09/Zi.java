package cn.itcast.day09.demo09;

public class Zi extends Fu {

    int num = 20;

    public Zi() {
        // 在本类的无参构造中，调用本类的有参构造
        this(123);  // 在本类的构造方法中，访问本类的另一个构造方法
    }

    public Zi(int n) {
        System.out.println(n);
    }

    public void showNum() {
        int num = 10;
        System.out.println(num);  // 局部变量
        System.out.println(this.num);  // 在本类的成员方法中访问本类的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
//        methodA();
        // 强调该方法是本类的，不是父类的
        this.methodA();  // 在本类的成员方法中，访问本类的另一个成员方法

        System.out.println("BBB");
    }

}

/*
 * super 关键字用来访问父类内容，而 this 关键字用来访问本类内容，用法也有三种：
 *
 * 1.在本类的成员方法中，访问本类的成员变量
 * 2.在本类的成员方法中，访问本类的另一个成员方法
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 * 在第三种调用中要注意：
 * this() 也必须是构造方法的第一个语句，且只能调用一个，此时 super 不再赠送
 * */