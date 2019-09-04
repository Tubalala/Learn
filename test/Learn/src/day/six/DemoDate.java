package day.six;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DemoDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date a = new Date(0L);
        System.out.println(a);
        Date b = new Date();
        System.out.println(b);
        SimpleDateFormat ab = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String date = ab.format(b);
        System.out.println(date);
    }
}
