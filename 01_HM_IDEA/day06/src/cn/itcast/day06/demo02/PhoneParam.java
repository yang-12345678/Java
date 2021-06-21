package cn.itcast.day06.demo02;

public class PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "huawei";
        one.price = 8000;
        one.color = "蓝色";
//        System.out.println(one);  // 打印的是 one 的地址值
        method(one);  // 传递进去的参数其实就是地址值
    }
    public static void method(Phone param) {
        // 当一个对象作为参数时，传递进去的是一个地址值
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }

}
