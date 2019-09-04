package day.eight.test;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠","♡","♧","♢"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
            }
        }
        Collections.shuffle(poker);
        System.out.println("洗牌后\n"+poker.size()+"\n"+poker);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                list4.add(p);
            } else if (i % 3 == 0) {
                list1.add(p);
            }else if (i % 3 == 1) {
                list2.add(p);
            } else if (i % 3 == 2) {
                list3.add(p);
            }
        }
        System.out.println("player1"+list1+list1.size());
        System.out.println("player2"+list2+list2.size());
        System.out.println("player3"+list3+list3.size());
        System.out.println("底牌"+list4);
    }
}
