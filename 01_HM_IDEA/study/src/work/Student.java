package work;

public class Student {

    String  name;  // 姓名
    char sex; // m 代表男，f 代表女
    long num; // 学号
    int age; // 年龄
    double score; // 总分

    public Student() {
        // 无参构造
    }

    public Student(String name, char sex, long num, int age, double score) {
        // 有参构造
        this.name = name;
        this.sex = sex;
        this.num = num;
        this.age = age;
        this.score = score;
    }

    public String toString() {
        return "[" + "姓名：" + name + "，性别：" + sex +"，年龄：" + age + "，学号：" + num + "，总分：" + score +"]";
    }

    public void printName() {
        // 其他方法： 打印姓名
        System.out.println(name);
    }

}
