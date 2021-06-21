package cn.itcast.day07.demo02;

public class Anonymous {
    public static void main(String[] args) {
        Person per = new Person();

        per.name = "刘嘉琪";
        per.show();

        // 使用匿名对象；
        // 一个 new 就是一个对象
        new Person().name  = "杨鹏宇";
        new Person().show();


    }
}

/*
* 创建对象的标准格式：
* 类名称 对象名 = new 类名称();
*
* 匿名对象：只有右边的对象，没有左边的名字和赋值运算符
* new 类名称();
*
* 匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象
* 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
* */
