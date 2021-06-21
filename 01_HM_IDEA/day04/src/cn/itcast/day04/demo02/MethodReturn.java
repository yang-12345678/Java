package cn.itcast.day04.demo02;

/*注意事项：
对于有返回值的方法，可以使用单独调用，打印调用或者赋值调用
对于没有返回值的方法，只能使用单独调用，不能使用其他调用方式
* */

public class MethodReturn {
    public static void main(String[] args){
        System.out.println(getSum(13, 14));
    }
    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }
}
