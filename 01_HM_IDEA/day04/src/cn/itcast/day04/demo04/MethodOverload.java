package cn.itcast.day04.demo04;

public class MethodOverload {
    public static void main(String[] args) {
//        System.out.println(sum(1, 3));
//        System.out.println(sum2(1, 3, 4));
//        System.out.println(sum3(1, 2, 3, 4));
        // 对于功能类似的方法来说，因为参数列表不一样，却需要记住这么多不同的方法名称，太麻烦
        /*为此引入方法的重载(Overload)
        * 特点：多个方法的名称一样，但是参数列表不一样*/
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 3, 4, 5));
        // 只要参数的个数对得上任意一个同名的sum，即可成功运行

    }
    public static int sum(int a, int b) {
        // 两个参数类型的方法
        return a + b;
    }
    public static int sum(double a, double b) {
        // 这样写是合法的
        return (int) (a +b);
    }



    /*方法重载与下因素相关：
    * 参数的个数不同
    * 参数类型不同
    * 参数的多类型顺序不同
    *
    * 方法重载与下列因素无关：
    * 与参数的名称无关  （换了形参，但是个数和其他的重复不行）
    * 与方法的返回值类型无关 （返回值类型不同,但参数个数相同的同名方法参数类型不能一样） */

    public static int sum(int a, double b) {
        return (int) (a + b);
    }
    public static int sum(double a, int b) {
        return (int) (a + b);
    }



    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
