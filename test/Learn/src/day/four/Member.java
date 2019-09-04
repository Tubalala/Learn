package day.four;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name,int num ) {
        super(name, num);
    }
    public Member() {
    }
    public void recive(ArrayList<Integer> list){
//        int index = new Random().nextInt(list.size());
//        Random r = new Random();
//        int index = r.nextInt(list.size());
//        int delta = list.remove(index);
//        int money = super.getNum();
//        super.setNum(money+delta);
        Random r = new Random();
        int index = r.nextInt(list.size());
        setNum(getNum()+list.remove(index));
    }
}
