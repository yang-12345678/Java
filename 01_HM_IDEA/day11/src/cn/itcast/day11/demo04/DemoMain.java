package cn.itcast.day11.demo04;

public class DemoMain {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();
    }
}

/*
权限修饰符使用规则：
1.外部类： public / default
2.成员内部类： 都可以写
3.局部内部类： 什么都不能写，也不是default的意思
 */
