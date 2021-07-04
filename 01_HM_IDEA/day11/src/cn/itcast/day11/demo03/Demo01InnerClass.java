package cn.itcast.day11.demo03;

public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body();
        // 通过外部类的对象，调用外部类的方法，里面间接使用内部类对象
        body.methodBody();

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }

}

/*
内部类的分类：
1.成员内部类
2.局部内部类(包含匿名内部类)

注意： 内用外，随意访问；外用内，需要内部类对象

如何使用成员内部类？两种方法：
1.间接方式：在外部类的方法中使用内部类，然后main只是调用外部类的方法
2.直接方式：外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */
