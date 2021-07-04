package cn.itcast.day11.demo04;

public class Outer {

    public void methodOuter() {
        class Inner { // 局部内部类
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }

}

/*
如果一个类是定义在一个方法内部的，那么这个内部类就是局部内部类
"局部"：只有当前所属的方法才能使用它，出了这个方法外面就不能用了
 */
