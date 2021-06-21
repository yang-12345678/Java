package cn.itcast.day09.demo12;

// 只重写了父类中的一个方法
// 子类也是一个抽象类
// 此时须再创建子类的子类
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();

}
