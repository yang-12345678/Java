package cn.itcast.day11.demo05;

public class DemoMultiField {
    public static void main(String[] args) {
        // 使用多态的写法
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);  // 父类中没有 错误写法

        // 子类没有覆盖重写，就是父：10  重写了就是子：20
        obj.showNum();


    }
}

/*
访问成员变量的两种方式：
1. 直接通过对象名称访问成员变量: 看等号左边是谁，则优先用谁，没有则向上找
2. 间接通过成员方法访问成员变量: 看该方法属于谁，则优先用谁，没有则向上找
 */
