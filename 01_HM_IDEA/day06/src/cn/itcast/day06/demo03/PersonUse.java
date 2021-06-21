package cn.itcast.day06.demo03;

public class PersonUse {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "刘嘉琪";
//        person.age = -20;  // private 后直接访问会报错
        person.setAge(20);

        person.show();
    }
}

/*
* 问题描述：
* 定义 Person 的年龄时，无法阻止不合理的数据被设置进来
*
* 解决方案： 用 private 关键字将需要保护的成员变量进行修饰
*
* 一旦使用 private 进行修饰，那么本类当中仍然可以随意访问。
* 但是， 超出了本类范围之外就不能再直接访问了。
*
* private 关键字可以提高我们代码的安全性*/