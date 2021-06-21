package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "adfakjddjagkj5648793145";

        // 将字符串变成一个字符数组
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

}
