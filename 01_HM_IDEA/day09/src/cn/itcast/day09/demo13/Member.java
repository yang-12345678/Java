package cn.itcast.day09.demo13;



import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> List) {
        // 从多个红包当中随便抽取一个，给我自己
        int index = new Random().nextInt(List.size());

        // 拿一个少一个，需要删除，并且得到被删除的红包
        int delta = List.remove(index);

        // 当前成员自己本来余额
        int money = super.getMoney();
        super.setMoney(money + delta);


    }

}
