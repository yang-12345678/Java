package cn.itcast.reflect;

import cn.itcast.domain.Person;

public class ReflectDemo1 {
    // 获取class的三种方式
    public static void main(String[] args) throws ClassNotFoundException {

        // 1. class.forName("全类名")
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);

        // 2. 类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        // 3. 对象.getClass()
        Person p = new Person();
        System.out.println(p);
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);  // 比较地址
        System.out.println(cls2 == cls3);

    }
}
