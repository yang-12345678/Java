package cn.itcast.day08.demo03;

public class Demo02StaticStudent {

    private int id;  // 学号
    private String name;
    private int age;
    static String room;  // 多个对象共享同一个值
    private static int idCounter = 0; // 每当 new 了一个新对象的时候，计数器++；

    public Demo02StaticStudent() {
        this.id = idCounter++;
    }

    public Demo02StaticStudent(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
