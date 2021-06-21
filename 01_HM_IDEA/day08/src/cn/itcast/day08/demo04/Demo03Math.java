package cn.itcast.day08.demo04;

public class Demo03Math {

    public static void main(String[] args) {

        // 绝对值  返回值 double
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(2.5));

        // 向上取整  范返回值 double
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));

        // 向下取整  返回值 double
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));

        // 四舍五入  返回值 long
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.9));

        // Math.PI  圆周率近似常量
    }

}
