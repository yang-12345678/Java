package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 泛型只能是引用类型，不能是基本类型

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);

        System.out.println(ls);

        int num = ls.get(0);
        System.out.println("第 0 号元素是：" + num);
    }

}

/*
* 如果希望向集合 ArrayList 中存储基本类型，必须使用基本类型对应的包装类
*
* 基本类型    包装类 （应用类型，包装类都位于 java.lang 包下）
* byte        Byte
* short       Short
* int         Integer    【特殊】
* long        Long
* float       Float
* double      Double
* char        Character   【特殊】
* boolean     Boolean
*
* 从 JDK1.5 开始，支持自动装箱，自动拆箱
*
* 自动装箱：基本类型  --》  包装类型   （自动的）
* 自动拆箱：包装类型  --》  基本类型    （自动的）
* */
