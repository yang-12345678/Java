package cn.itcast.day10.demo01;

public interface MyInterfaceDefault {

    public abstract void methodA();

    // 新添加了抽象  会报错
//    public abstract void methodB();

    // 新添加默认方法
    default void methodDefault(){
        System.out.println("新添加的默认方法");
    }
}


/*
* 从 java8 开始，接口定义里允许定义默认方法。
* 格式：
* public default 返回值类型 方法名称（参数） {
*     方法体
* }
*
* 接口当中的默认方法： 可以解决接口升级的问题
*
* 默认方法的权限都是 public
*
*/