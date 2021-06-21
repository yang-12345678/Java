package day03;

/*
ASCII码表：128个  A 65    a 97    0 48
Unicode码： 万国码
*/


public class Demo01DataType {
    public static void main(String[] args){
        char zifu1 = '1';
        System.out.println(zifu1 + 0);  // 49

        char zifu2 = 'A';
        char zifu3 = 'c';
        int num = zifu3;
        System.out.println(num);  // 99

        char zifu4 = '中';
        System.out.println(zifu4 + 0);  // 20013
        }

}
