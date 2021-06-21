package cn.itcast.day06.demo03;

public class Method_Fz {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35, 45};
        int max = getMax(array);
        System.out.println(max);

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
/*
* 面向对象三大特征： 封装、继承、多态
*
* 封装性在 java 中的体现：、
* 1.方法就是一种封装
* 2.关键字 private 也是一种封装
*
* 封装就是将一些细节信息隐藏起来，对于外界不可见。
* */