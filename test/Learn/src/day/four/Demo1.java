package day.four;

import java.util.ArrayList;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Manager one = new Manager("boss",1000);
        Member two = new Member("worker1",0);
        Member three = new Member("worker2",100);
        Member four = new Member("worker3",50);

        one.show();
        two.show();
        three.show();
        four.show();

        ArrayList<Integer> send = one.send(1000, 3);
        //one.send(1000,3);
        System.out.println(send.size());
        two.recive(send);
        three.recive(send);
        four.recive(send);
        two.show();
        three.show();
        four.show();

    }
}
