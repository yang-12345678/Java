package cn.itcast.day09.demo05;

public class Demo01Override {

}

/*
* 方法重写的注意事项：
*
* 1.必须保证父子类之间方法的名称相同，参数列表也相同
*   注解：@Override:写在方法前面，用来检测是不是有效的正确覆盖重写。 不写注解也可以。
*
* 2.子类方法的返回值必须小于等于父类方法的返回值范围。
*   前提：java.lang.Object 类是所有类的公共最高父类（祖宗类）
*
* 3. 权限修饰符：  子类方法 >= 父类方法
*
*    public 》 protected 》 （default） 》 private
*
*    备注：（default）不是关键字default，而是什么都不写，留空。
* */
