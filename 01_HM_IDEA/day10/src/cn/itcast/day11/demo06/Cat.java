package cn.itcast.day11.demo06;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 子类特有的
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
