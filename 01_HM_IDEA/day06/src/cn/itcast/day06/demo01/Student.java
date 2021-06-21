package cn.itcast.day06.demo01;

public class Student {
    // 成员变量
    String name ;  // 姓名
    int age;  // 年龄

    // 成员方法
    public void eat() {
        System.out.println("吃饭！");
    }
    public void sleep() {
        System.out.println("睡觉！");
    }
    public void study() {
        System.out.println("学习！");
    }
}

/*学生类
 *     属性： 姓名，年龄
 *     行为： 吃饭，睡觉，学习
 *
 * 对应到 java 的类当中
 *     成员变量（属性）：
 *         String name； // 姓名
 *         int arg；  // 年龄
 *     成员方法（行为）：
 *         public void eat(){}  // 成员方法不用static
 *
 * 注意事项：
 * 1.成员变量是直接定义在类当中的，在方法外边
 * 2.成员方法不要写 static
 * */