package day.six;

import java.util.Calendar;
import java.util.Date;

public class DemoCalendar {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        Date time = c.getTime();
        System.out.println(time);//把日历变成日期
        c.add(Calendar.YEAR,1);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        c.set(Calendar.MONTH,3);
        int AfterSet_Month = c.get(Calendar.MONTH);
        System.out.println(AfterSet_Month);
    }
}
