package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class c = Person.class;
        // 获取成员变量们
        // 1.Field[] getFields()
        Field[] fields = c.getFields();
        for (Field field :
                fields) {
            System.out.println(field);
        }

        // 2. Field getField()
        Field a = c.getField("a");
        System.out.println(a);
        // 获取成员变量的值

        Object value = a.get(new Person());
        System.out.println(value);

        Person p = new Person();
        // 设置成员变量的值
        a.set(p, "张三");
        System.out.println(p);

        // Field[] declaredFields  获取所有的成员变量, 不考虑修饰符
        Field[] declaredFields = c.getDeclaredFields();
        System.out.println(declaredFields);

        for (Field declaredField:
             declaredFields) {
            System.out.println(declaredField);
        }

        // Field getDeclaredField
        Field d = c.getDeclaredField("d");

        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); // 暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);  // d 是私有的，访问异常

        // 获取构造方法
        Constructor constructor = c.getConstructor(String.class, int.class);
        Constructor constructor1 = c.getConstructor();
        System.out.println(constructor);
        // 创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = c.newInstance(); // class 对象中的
        System.out.println(o);

        // 获取指定名称的方法  public
        Method eatm = c.getMethod("eat");
        // 执行方法
        eatm.invoke(p);

        // getName()  获取类名
    }
}
