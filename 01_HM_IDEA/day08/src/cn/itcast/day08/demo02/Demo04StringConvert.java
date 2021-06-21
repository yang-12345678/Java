package cn.itcast.day08.demo02;

public class Demo04StringConvert {
    public static void main(String[] args) {
        // 将字符串转换成 char 型数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        // 转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 替换字符串
        String str = "How do you do?";
        String str2 = str.replace("o", "*");  // 用 * 替换 o
        System.out.println(str2);
    }
}
