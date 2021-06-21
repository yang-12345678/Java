package cn.itcast.day08.demo01;

public class Demo02String {
    public static void main(String[] args) {
        String str1 = "abc";  // 直接创建在 池中
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);  // new的不在池当中

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));  // 忽略大小写

        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));  // 只有英文忽略大小写
    }
}

/*
 * 字符串常量池，程序当中直接写上的双引号字符串，就在字符串常量池中。
 *
 * 对于基本类型来说， == 是进行数值的比较
 * 对于引用类型来说， == 是进行地址的比较*/