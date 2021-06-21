package cn.itcast.day06.demo02;

public class PhoneUse {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "HUAWEI";
        one.price = 8000;
        one.color = "天空之境";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("刘嘉琪");
        one.sendMessage();
        // 成员方法 在 堆 中保存的是一个地址值，指向方法栈中的地址

        Phone two = one;  // 将对象 one 的地址赋值给 对象 two ,两个变量指向同一块地址
        System.out.println(two.price);

    }
}
