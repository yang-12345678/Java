package day05;

public class Note {
    public static void main(String[] args) {
        /*
         * 对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围
         * 那么javac编译器会自动隐含地为我们补上一个(byte),(short),(char)
         *
         * 如果没有超过左侧的范围，编译器补上强转
         * 如果右侧超过了左侧范围，直接报错
         *
         * 编译器的常量优化：
         *
         * 在给变量进行赋值的时候，如果右侧的表达式当中全都是常量吗，没有任何变量
         * 如 short result = 5 + 8
         * 那么编译器javac将会将若干个常量表达式计算得到结果
         * result = 13
         * 编译时直接得到13，不用等到运行的时候,编译的时候就会得到13
         * 注意还是不能超过左侧的范围
         * */

        // byte a = 155;
        // System.out.println(a);
        long a = 12L;
        int b = 13;
        System.out.println(a + b);

        float d = 3;
        System.out.println(d);
    }
}
