package cn.itcast.day09.demo01;

public class Demo01Extends {

    public static void main(String[] args) {
        // 创建了一个子类对象, 继承来自父类的 method 方法
        Teacher teacher = new Teacher();
        teacher.method();

        // 创建了一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }

}

/*
* 继承是多态的基础
*
* 在继承的关系中，"子类就是一个父类"。也就是说，子类可以被当做父类看待。
* 例如：父类是员工，子类是讲师，那么 "讲师就是一个员工"。 关系： is-a。
*
* 定义父类的格式： 就是一个普通类的定义。
*
* 定义子类的格式：
*   public class 子类名称 extends 父类名称 {
*         // ...
*     }*/