package cn.itcast.day09.demo02;

public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();  // 创建父类对象
        System.out.println(fu.numFu);  // 只能使用父类的东西，没有任何子类的内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        // 等号左边是谁，就优先用谁
        System.out.println(zi.num);
//        System.out.println(zi.abc);  // 到处都没有算错

        // 这个方法是子类的，如果没有再先向上找
        zi.methodZi();
        // 这个方法是父类的，
        zi.methodFu();  // 100
    }

}

/*
* 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
*
* 直接通过子类对象访问成员变量：
*    等号左边是谁，就优先用谁，没有则向上找
* 间接通过成员方法访问成员变量：
*    该方法属于谁，就优先用谁，没有则向上找
* */