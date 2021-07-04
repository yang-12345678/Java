package cn.itcast.day11.demo05;

public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();  // 父子都有，优先用子
        obj.methodFu();  // 子类没有，向上找父类
        // 编译看左边:左边是父类，父类没有methodZi
        // 运行看右边。 成员变量不适用
//        obj.methodZi();  // 错误写法

    }
}

/*
在多态的代码中，成员方法的访问规则是：
   看new 的是谁，就优先用谁，没有则向上找

成员变量：编译看左边，运行看左边
成员方法：编译看左边，运行看右边
编译不通过不能运行

使用多态的好处：无论右边new的时候换成哪个子类对象，等号左边都不会发生变化
 */
