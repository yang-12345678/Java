package cn.itcast.day11.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了Abs方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
}
