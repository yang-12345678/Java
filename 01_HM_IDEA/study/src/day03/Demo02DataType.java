package day03;


/*
强制类型转换
    1.特点：代码需要进行特殊的格式处理，不能自动完成
    2.格式：范围小的类型  范围小的变量名 = （范围小的类型） 比原本范围大的数据

注意事项：
    1.强制了类型转换一般不推荐使用，因为有可能发生精度损失（浮点数），数据溢出（整数）
    2.byte/short/char这三种类型都可以发生数学运算，例如加法"+"
    3.byte/short/char这三种类型在运算时首先会被提升成为int类型，然后在计算
*/
public class Demo02DataType {
    public static void main(String[] args){
        // 从long到int不是从小到大，不能自动转换，但可以强制类型转换
        //int num1 = 100L;
        int num1 = (int)100L;
        System.out.println(num1);

        byte a = 50;
        byte b = 40;
        // 计算时首先转换成int，左侧不用int接收会报错

        int  c = a + b;
        System.out.println(c);
    }
}
