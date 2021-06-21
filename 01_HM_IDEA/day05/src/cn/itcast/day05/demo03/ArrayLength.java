package cn.itcast.day05.demo03;

/*
* 数组一旦创建，程序运行期间，长度不可改变*/

public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1,2,3,4,56,78,9,10,23,14,};
        int len;
        len = arrayB.length;
        System.out.println(len);

        int[] arrayc = new int[3];
        System.out.println(arrayc.length);
        arrayc = new int[5];
        System.out.println(arrayc.length);
        // 并不是 c 数组的长度发生了改变，而是重新new出了一片空间
    }
}
