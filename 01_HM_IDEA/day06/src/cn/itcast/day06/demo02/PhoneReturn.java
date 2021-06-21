package cn.itcast.day06.demo02;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);

    }
    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 500;
        one.color = "黑色";
        return one;
    }
}
