package cn.itcast.day11.demo04;

public class MyOuter {
    public void methodOuter() {
        int num = 10;  // 等价于 final int num = 10;  不可改变

        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}

/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是有效【final】的
java8新特性，只要局部变量确实不变，final可以省略，

原因：
1.new出来的对象是在堆内存中的
2.局部变量是跟着方法走的，在栈内存当中
3.方法运行结束之后，立刻出栈，局部变量就会立刻消失
4.但是new出来的对象会在堆内存当中持续存在，直到垃圾回收消失
 */
