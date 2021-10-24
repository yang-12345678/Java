package com.itheima.demo0dd.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }

    // long getTime(): 把日期转换为毫秒值
    // 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
    public static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    // Date类的有参构造方法
    // Date(long date)：传递毫秒值，把毫秒值转换成Date日期
    public static void demo02() {
        Date date = new Date(3742767540068L);
        System.out.println(date);
    }

    // Date类的无参构造方法
    // Date() 获取当前系统的日期和时间
    public static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
