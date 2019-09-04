package day.eight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
//        demoA();
        demoB();
    }

    private static void demoB() {
        Person one = new Person();
        int h1 = one.hashCode();
        System.out.println(h1);

        Person two = new Person();
        int h2 = two.hashCode();
        System.out.println(h2);

        System.out.println(one);
        System.out.println(two);
        //重写后为1  但物理地址不相等
        System.out.println(one==two);

        //字符串类重写了hashCode
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println("通话".hashCode()+"\n"+"重地".hashCode());

    }

    private static void demoA() {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(34);
        set.add(56);
        set.add(78);
        set.add(90);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.print(next);
        }
        System.out.println();
        for (Integer i :
                set) {
            System.out.print(i);
        }
    }
}
