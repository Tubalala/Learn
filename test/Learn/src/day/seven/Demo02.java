package day.seven;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            //类型转换麻烦
            Object s1 = it.next();
            System.out.print(s1);
            System.out.println();
            Object s2 =(Object)s1;
            System.out.println(s2);
        }
        demo01();
    }

    private static void demo01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s+"->"+s.length());
        }
    }
}
