package cn.itcast.day04.demo02;

/*定义方法的完整格式：
  修饰符  返回值类型 方法名称（参数类型 参数名称）{
      方法体；
      return 返回值；  // return 可以用来停止方法，也可以传递返回值
* */

public class MethodDefine {
    public static void main(String[] args) {
        // 打印调用
        System.out.println(sum(23, 34));

        // 赋值调用
        int c;
        c = sum(24, 29);
        System.out.println(c);
    }
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
