package cn.itcast.day11.demo01;

public interface MyInterfaceConst {

    // 这其实就是一个常量，一旦赋值，就不可修改
    public static final int NUM = 10;

}

/*
* 接口当中也可以定义“成员变量”： 但是必须使用 public static final 三个关键字进行修饰
* 从效果上看，这其实就是接口的 【常量】
*
* 注意事项：
* 1.接口当中的常量，可以省略 public static final，但是省略也是相当于这三个。
* 2.接口当中的常量，必须进行赋值，不能不赋值。
* 3.接口当中的常量，使用完全大写的字母，用下划线进行分割。（规范命名）
* */
