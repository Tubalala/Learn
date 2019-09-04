package day.eight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        listDemo();
        linkedlistDemo();//linkedList特有方法不能使用多态

    }

    private static void linkedlistDemo() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("say");
        linked.add("hello world");
        System.out.println(linked);

        linked.addFirst("aaa");
        linked.addLast("!!!");
        linked.push("cab");//相当于addFirst()
        System.out.println(linked);

        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first+"  "+last);
        }

        String s1 = linked.removeFirst();
        String s2 = linked.removeLast();
        System.out.println(s1+"  "+s2);
        System.out.println(linked);
        String pop = linked.pop();
        System.out.println(pop);
        System.out.println(linked);//相当于removeFrist()

    }

    private static void listDemo() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add(3,"it");
        System.out.println(list);
        String removeE = list.remove(2);
        System.out.println("remove:"+removeE);
        System.out.println(list);

        String setE = list.set(3, "hello world");
        System.out.println("setE:"+setE);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s =list.get(i);
            System.out.print(s);
        }
        System.out.println();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.print(next);
        }
        System.out.println();

        for (String s:
                list) {
            System.out.print(s);
        }
    }

}
