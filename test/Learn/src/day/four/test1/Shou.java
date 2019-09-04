package day.four.test1;
import java.util.ArrayList;
import java.util.Random;

public class Shou extends User{
    public Shou() {
    }
    public Shou(String name, int leftMoney) {
        super(name, leftMoney);
    }

    public void receive (ArrayList<Integer> redPacket){
        Random r = new Random();
        int index = r.nextInt(redPacket.size());
        setLeftMoney(getLeftMoney()+redPacket.remove(index));
    }
}