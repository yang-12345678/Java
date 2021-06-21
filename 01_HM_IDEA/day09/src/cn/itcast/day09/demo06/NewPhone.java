package cn.itcast.day09.demo06;

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();  // 把父类的 show 方法拿来重复利用
        // 自己子类中再来添加更多的内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }

}
