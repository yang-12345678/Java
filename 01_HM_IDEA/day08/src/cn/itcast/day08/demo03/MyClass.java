package cn.itcast.day08.demo03;

public class MyClass {
    public void method() {
        System.out.println("这是一个普通的成员方法。");
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
    }

    public static void main(String[] args) {
        // static 修饰成员方法，则成为静态方法，静态方法属于类，不属于对象
        // 如果没有 static 关键字，必需创建对象，才能使用方法
        // 如果有了 static 关键字，不需要创建对象，直接通过类名称就可以调用
        MyClass my = new MyClass();
        my.method();

        // 对于静态方法来说，可以通过对象名来调用，也可以通过类名称来调用
        // 本类当中的成员方法可以省略类名称
        MyClass.methodStatic(); // 推荐使用这种方法
    }
}

/*
* 注意事项：
* 1.静态不能直接访问非静态
*   成员方法可以访问成员变量，也可以访问静态变量
*   静态方法可以访问静态变量，不能直接访问非静态变量（原因：内存中先有静态，后有非静态）
*
* 2.静态方法中不能使用 this
*   原因：this 代表当前对象，静态方法不属于对象*/