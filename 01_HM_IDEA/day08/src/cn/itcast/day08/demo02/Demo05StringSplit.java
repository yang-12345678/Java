package cn.itcast.day08.demo02;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        // 切割，返回字符串数组
        String[] array1 = str1.split(",");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // split 方法的参数其实是一个 “正则表达式”， 用 . 切分，，必须写 \\.
        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split(".");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
