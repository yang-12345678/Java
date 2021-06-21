package day02;

/*
使用变量时的注意事项
    1.变量名之间不重复
    2.对于使用float和long类型来说，字母后缀不要丢掉
    3.如果使用byte或short类型的变量，右侧不要超过左侧
    4.没有进行赋值的变量不能直接使用
    5.变量使用不能超过作用域的范围
    6.复合语句{}， 类似C语言
*/

public class Demo02Variable {
    public static void main(String[] args) {
        int a;
        a = 1000000000;
        System.out.println(a);

    }
}
