package cn.itcast.day08.demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));  // 地址不一样，但内容一样
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str3));
        // 如果点之前是 null， 会报错：空指针异常：NullPointerException

    }
}

/*
* == 是进行对象的地址值比较，如果确实需要字符串内容比较，可以使用两个方法。
* public boolean equals(Object obj)；只有参数是一个字符串并且内容相同的才会给 true，否则返回 false
* 注意事项：
* 1.任何对象都可以用 Object 进行接收
* 2.equals 方法具有对称性， a.equals(b) == b.equals(a)
* 3.如果比较双方一个常量一个变量，推荐常量写在前面 */

