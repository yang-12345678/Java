package cn.itcast.day11.demo04;

public class Demo01Multi {
    public static void main(String[] args) {
        // 使用多态
        // 左侧父类的引用，指向了右侧子类的对象
        // 将子类看作一个父类对象看待
        Fu obj = new Zi();
        obj.method(); // new 的是谁就运行谁，
        obj.methodFu();
    }
}

/*
代码当中体现多态性，其实就是一句话，父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名称 = new 实现类名称();

 */
