package cn.itcast.day11.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodA() {
        System.out.println("实现了抽象方法B");
    }

    @Override
    public void methodDefault() {
        System.out.println("这是覆盖重写的默认方法");
    }

}
