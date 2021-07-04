package cn.itcast.day11.demo01;

public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
        methodCommon();
//        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
//        methodCommon();
        methodCommon();
    }

    // 抽取相同代码片段， 此方法多出了一个默认方法，在实现类对象中可以调用，不妥
//     public default void methodCommon() {
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }

    // 普通私有方法
    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    // 静态私有方法，上述普通私有方法加上 static

}

/*
* java 9 开始，可以定义私有方法
* 普通私有方法：解决多个默认方法之间重复代码问题
* 静态私有方法：解决静态方法之间代码问题
* */
