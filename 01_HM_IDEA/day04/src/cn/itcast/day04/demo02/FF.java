package cn.itcast.day04.demo02;

/*注意事项：
 * 1.方法的定义顺序无所谓
 * 2.方法的定义是同等级的，不能嵌套定义，但可以嵌套使用
 * 3.方法定义之后自己不会执行，要执行必须调用
 * 4.如果方法有返回值，那么必需写上"return" 返回值； 不可没有
 * 5.return 后面的返回值类型必须和方法定义时候的一模一样
 * 6.对于一个 void 没有返回值的方法，不能写 return 后面的返回值，只能写 return 自己
 *   此时 return 可以省略
 * */

public class FF {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
