package day01;


/*
java项目结构
    项目 --》 Moudle(模块) --> 包

关键字是完全小写的字母

标识符命名规则：
    1.由数字，字母，$,和下划线组成
    2.不能以数字开头
    3.不能使用关键字
    命名规范：
        类名规范：首字母大写，后面每个单词首字母大写（大驼峰式），HelloWorld
        变量名规范：首字母小写，后面每个单词的首字母大写（小驼峰式）。
        方法名规范：同变量名。
*/


// 第一行的第三个单词必需和所在的文件名完全一样，大小写也要一样
// public class 后面代表定义一个类的名称，类是java当中所有源代码的基本组织单位
public class Demo01Hello {
    // 第二行的内容固定不变，代表main方法
    // 这一行代表程序执行的起点

    public static void main(String[] args) {
        // 打印输出语句
        System.out.println("hello world");

    }
}