package day01;


/*
常量：在程序运行期间固定不变的量

常量的分类：
    字符串常量：凡是用双引号引起来的部分  "abd", "12j"
    整型常量：就是整数，
    浮点型常量：实数  2.5 3.0
    字符常量： 'a', 单引号单个字符, '9' '中'
    布尔常量：true，false
    空常量：NULL，代表没有任何数据
*/

public class Demo02Const {
    public static void main(String[] args) {
        // 字符串常量
        // 和python类似，打印完自动换行
        System.out.println("ABC");
        System.out.println("");
        System.out.println("XYZ");

        // 整型常量
        System.out.println(30);
        System.out.println(500);

        // 浮点常量
        System.out.println(3.2);

        // 字符常量
        // 不能为空，不能超过一个，（空格可以）
        System.out.println('A');

        // 布尔型常量
        System.out.println(true);
        System.out.println(false);

        // 空常量 空常量不能直接打印
//        System.out.println(null);


    }
}
