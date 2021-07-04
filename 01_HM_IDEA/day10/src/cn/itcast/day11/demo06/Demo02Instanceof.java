package cn.itcast.day11.demo06;

public class Demo02Instanceof {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();

        // 如果希望调用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = new Dog();
            dog.watchHouse();
        }
        // 判断一下父类引用animal本来是不是Cat
        if (animal instanceof Cat) {
            Cat cat = new Cat();
            cat.catchMouse();
        }



    }
}

/*
如何才能知道一个父类引用的对象，本来是什么子类?
格式：
对象 instanceof 类
这将会得到一个boolean值结果，也就是就判断当前的对象能不能当做后面类型的实例
 */