package cn.itcast.day05.demo01;

/*使用动态数组的时候，其中的每个元素将会自动拥有一个默认值，规则如下：
* 整数类型   0
* 浮点类型   0.0
* 字符类型   '\u0000'
* 布尔类型   false
* 引用类型   null
*
* 注意事项：
* 静态初始化也有默认值的过程，只不过系统立刻自动将默认值替换成了大括号当中具体的值*/

public class ArrayUse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
//        System.out.println(array);  // 直接打印数组名称，打印的是数组内存地址哈希值
        System.out.println(array[1]);  // 索引只能为整

    }

}
