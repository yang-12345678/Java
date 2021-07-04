package cn.itcast.day11.demo05;

public class DemoMain {

    public static void main(String[] args) {
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();

        // 匿名内部类，不是匿名对象
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写了方法！");
            }
        };
        obj.method();

        // 匿名内部类，也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写了方法！");
            }
        }.method();
    }

}

/*
如果接口的实现类(或者是父类的子类) 只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

注意事项：
1.匿名内部类，在【创建对象】的时候只能使用唯一的一次。
  如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
2.匿名对象是在【调用方法】的时候，只能调用唯一的一次。
  如果希望多次调用，那么必须给对象起个名字。
3.匿名内部类是省略了【实现类/子类】，匿名对象是省略了【对象名称】。
 */
