package day04;

/*
* 单独使用时 前++ 和 后++ 没有任何区别
* 混合使用时，和C语言一样
* 比较运算符，和C语言有所不同，结果为真时，是true
* && 和 || 和C语言一样，，java中称短路效果
* 数据类型 数据名称 = 条件判断 ？ 表达式A ： 表达式B   条件运算符，和C语言一样
* 冒号左边和右边必需满足 赋给的变量的数据类型
* */

public class Demo02Operator {
    public static void main(String[] args){
        int num1 = 10;
        ++num1;
        System.out.println(num1);
    }
}
