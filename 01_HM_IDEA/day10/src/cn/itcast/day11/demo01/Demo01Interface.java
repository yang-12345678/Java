package cn.itcast.day11.demo01;

public class Demo01Interface {
    public static void main(String[] args) {
        // 不能直接 new 接口对象使用。创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();

    }

}

/*
* 接口就是多个类的公共规范。
* 接口是一种引用类型，最重要的内容就是其中的：抽象方法。
*
* 定义接口的格式：
* public interface 接口名称 {
*     接口内容
* }
*
* 接口中可以包含的内容：
* java7:
* 1.常量
* 2.抽象方法
*
* java8:
* 3.默认方法
* 4.静态方法
*
* java9：
* 5.私有方法
*
* 高版本可以拥有低版本的内容
*
* 接口使用步骤：
* 1.接口不能直接使用，必须有一个 “实现类” 来 “实现” 接口
* 格式：
* public class 实现类名称 implements 接口名称 {
*     //
* }
*
* 2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
*   去掉 abstract 关键字
*
* 3.创建实现类的对象，进行使用。
*
* 注意事项：
* 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
*
* */
