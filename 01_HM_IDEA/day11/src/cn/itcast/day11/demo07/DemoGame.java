package cn.itcast.day11.demo07;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("刘嘉琪");

        // 设置英雄技能
        hero.setSkill(new SkillImpl());

        hero.attack();

    }

}
