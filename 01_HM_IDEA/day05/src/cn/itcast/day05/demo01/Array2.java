package cn.itcast.day05.demo01;

/*静态初始化省略格式
 * 数据类型[] 数组名字 = {元素1， 元素2，...}
 *
 * 注意事项：
 * 1.动态/静态初始化，标准形式可以拆分成两个步骤
 * 2.静态的省略格式不能拆成两步
 *
 * 使用建议：
 * 如果不确定数组中的具体内容，使用动态初始化，否则，使用静态初始化*/

public class Array2 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 5};

        // 拆分两步
        int[] arrayB;
        arrayB = new int[]{11, 12, 13};

        int[] arrayC;
        arrayC = new int[5];
    }
}
