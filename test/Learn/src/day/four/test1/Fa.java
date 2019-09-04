package day.four.test1;
import java.util.ArrayList;                                        //这两个是导包
import java.util.Random;

public class Fa extends User{
    public Fa() {
    }
    public Fa(String name, int leftMoney) {
        super(name, leftMoney);
    }
    public ArrayList<Integer> redPacket(int totalMoney,int geShu){
        if(totalMoney > getLeftMoney()){
            System.out.println("余额不足你发个锤子？");
        }
        ArrayList<Integer> packet = new ArrayList<>();
        int avr = totalMoney / geShu;
        int duo = totalMoney % geShu;
        for (int i = 0; i < geShu-1; i++) {
            packet.add(avr);
        }
        int last = avr + duo;
        packet.add(last);
        setLeftMoney(getLeftMoney()-totalMoney);
        return packet;
    }
}
