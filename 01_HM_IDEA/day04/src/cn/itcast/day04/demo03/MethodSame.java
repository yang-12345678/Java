package cn.itcast.day04.demo03;

/*题目要求：
* 定义一个方法，用于判断两个数字是否相同
* */

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(1, 4));
        System.out.println(isSame(3, 3));
    }
    public static boolean isSame(int a, int b) {
        boolean Same;
//        if (a == b) Same = true;
//        else Same = false;
        Same = a == b;
        return Same;
        // 或者 return a == b;
    }
}
