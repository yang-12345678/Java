package cn.itcast.day09.demo02;

public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        // 因为本类中有 num，所以这里用的是本类的 num
        System.out.println(num);
        System.out.println(1);
    }

}
