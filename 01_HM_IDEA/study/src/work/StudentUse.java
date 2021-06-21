package work;

public class StudentUse {
    public static void main(String[] args) {
        Student one = new Student("yang",'m',2019302058,18,10);

        System.out.println(one.toString());
        one.printName();

    }
}
