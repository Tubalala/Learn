package day.four.test1;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Fa fa = new Fa("Pony",888);
        Shou b = new Shou("Mundo",0);
        Shou c = new Shou("老铁",0);
        Shou d = new Shou("小胖",0);
        Shou e = new Shou("大黄",0);

        fa.show();
        b.show();
        c.show();
        d.show();
        e.show();
        System.out.println("==============");

        ArrayList<Integer> list = new ArrayList<>();        //这里需要创建一个新的集
        list = fa.redPacket(666,4);

        b.receive(list);
        c.receive(list);
        d.receive(list);
        e.receive(list);

        fa.show();
        b.show();
        c.show();
        d.show();
        e.show();
    }
}
