package cn.itcast.day06.demo04;

public class PersonUse {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "刘嘉琪";
        person.sayHello("杨鹏宇");
    }
}

/*
* 当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。
* 如果需要访问本类当中的成员变量，需要使用格式。  this.name
*
* 通过谁调用的方法，谁就是 this, 就是类
*
* */