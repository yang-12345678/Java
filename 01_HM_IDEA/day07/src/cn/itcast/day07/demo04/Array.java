package cn.itcast.day07.demo04;

public class Array {

    // 要求:定义一个数组，用来存储3个 Person 对象
    public static void main(String[] args) {
        // 创建一个长度为3的数组，里面用来存放 Person 类型的数据
        Person[] array = new Person[3];
//        System.out.println(array[0]);  // 引用类型的默认值是 null
        Person one = new Person("刘嘉琪", 18);  // 对象直接打印是对象的地址
        Person two = new Person("杨鹏宇", 19);
        Person three = new Person("汤中文",20);

        array[0] = one;  // 将 one 当中的地址值复制到数组的0号元素位置
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);  // 地址值
        System.out.println(array[0].getName());
    }

}

/*
* 数组有一个缺点： 一旦创建，程序运行期间长度不可改变
* */

