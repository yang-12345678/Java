package cn.itcast.day08.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "abcdefghijklmn".length();
        System.out.println("字符串的长度是:" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("第一号索引的字符是:" + ch);

        // 查找 子串 在 主串 当中第一次出现的位置
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是:" + index);

        // 没有返回 -1
        System.out.println(original.indexOf("abc"));
    }
}
