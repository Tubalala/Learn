package day.four;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(String name, int num) {
        super(name, num);
    }
    public Manager() {
    }
    public ArrayList<Integer> send(int money,int number){
        ArrayList<Integer> list = new ArrayList<>();
        int leftmoney = super.getNum();
        if (leftmoney < money) {
            System.out.println("你的余额不足！");
            return null;
        }
        super.setNum(leftmoney-money);
        int avg = money / number;
        int mod = money % number;
        for (int i = 0; i < number-1; i++) {
            list.add(avg);
        }
        int last = avg+mod;
        list.add(last);
        return  list;
    }
}
