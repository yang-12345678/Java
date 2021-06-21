package day05;

/*
* 定义一个方法的格式：
*     public static void 方法名称() {
*        方法体
*     }
*
* 方法的命名规则和变量一样，采用小驼峰式
* 方法体：也就是大括号当中可以包含任意条语句
*
* 注意事项：
*     1.方法的定义先后顺序无所谓
*     2.方法的定义不能产生嵌套包含关系
* */

public class Demo01Method {
    public static void main(String[] args){
        // 方法必需调用才会执行
        farmer();

    }

    // 定义一个名为 farmer 的方法，类似C语言中的函数
    public static void farmer(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }
}
