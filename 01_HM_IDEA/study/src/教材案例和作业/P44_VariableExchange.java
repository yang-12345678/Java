package 教材案例和作业;

public class P44_VariableExchange {
    public static void main(String[] args) {

        int number1 = 12;
        int number2 = 21;
        System.out.println("交换前：number1=" + number1 +", number2=" + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("交换后：number1=" + number1 +", number2=" + number2);

        // 异或运算完成交换
        int a = 10;
        int b = 1;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
