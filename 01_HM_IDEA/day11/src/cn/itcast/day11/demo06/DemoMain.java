package cn.itcast.day11.demo06;

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并且设置年龄
        hero.setName("LJQ");
        hero.setAge(20);

        // 武器对象
        Weapon weapon = new Weapon("JJJJ");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();

    }

}
