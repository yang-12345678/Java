package cn.itcast.day09.demo07;

public class Zi extends Fu {

    public Zi() {
        // super();  默认调用父类无参构造方法, 父类中没有则报错
        super(20);  // 调用父类重载的构造方法，寻找参数对应到的重载方法
        System.out.println("子类构造方法！");
    }



}
