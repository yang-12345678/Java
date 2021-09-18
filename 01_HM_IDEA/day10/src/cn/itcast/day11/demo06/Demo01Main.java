package cn.itcast.day11.demo06;

public class Demo01Main {
    public static void main(String[] args) {
        // 对象的向上转型：就是，父类引用指向子类对象。
        // 其实就是多态的写法
        // 含义：把子类对象当作父类看待

        Animal animal = new Cat();
        animal.eat();
//        animal.catchMouse();  // 错误写法

        // 向下转型，进行‘还原’动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        // 错误的向下转型
        Dog dog = (Dog) animal;  // 编译不会报错，运行会出现异常
        // java.lang.ClassCastException 类转换异常
        dog.eat();
    }
}

/*
向上转型一定是安全的  小-->大

对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
解决方案：用对象的向下转型还原

 */
