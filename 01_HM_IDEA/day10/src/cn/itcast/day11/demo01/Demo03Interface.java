package cn.itcast.day11.demo01;

public class Demo03Interface {

    public static void main(String[] args) {
        // 创建了实现类对象 （实现静态方法没有必要）
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // 错误写法
//        impl.methodStatic();

        // 正确写法
        // 通过接口名称，直接调用接口中的静态方法
        MyInterfaceStatic.methodStatic();
    }

}

/*
注意: 不能通过接口实现类对象来调用接口当中的静态方法
*/
