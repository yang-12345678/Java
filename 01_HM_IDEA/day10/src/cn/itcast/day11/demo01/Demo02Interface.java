package cn.itcast.day11.demo01;

public class Demo02Interface {

    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodA();  // 调用抽象方法，实际运行的是右侧实现类

        // 调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();  // MyInterfaceDefault 这种并无此方法，但可以调用

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodDefault();

    }

}

/*
* 1.接口的默认方法，可以通过接口实现类类对象，直接调用
* 2.接口的默认方法，也可以被接口实现类进行覆盖重写*/
