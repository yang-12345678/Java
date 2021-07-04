package cn.itcast.day11.demo03;

public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}

/*
问：这个子接口当中有几个方法？
答：4个
methodA from A
methodB from B
methodCommon from A and B
method from mine
 */
