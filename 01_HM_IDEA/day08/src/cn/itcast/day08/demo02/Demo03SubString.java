package cn.itcast.day08.demo02;

public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        // 从 5 号索引开始截取
        String str2 = str1.substring(5);
        System.out.println(str1);  // 源字符串不可能发生改变
        System.out.println(str2);

        String str3 = str1.substring(4, 7);  // [4, 6]
        System.out.println(str3);
        // 字符串重新赋值必定会改变地址，python 中也是

    }
}
