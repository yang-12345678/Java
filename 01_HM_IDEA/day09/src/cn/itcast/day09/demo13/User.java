package cn.itcast.day09.demo13;

// 用户类
public class User {

    private String name;  // 姓名
    private int money;  // 余额

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 显示当前用户余额
    public void show() {
        System.out.println("用户名：" + name + ",余额：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
