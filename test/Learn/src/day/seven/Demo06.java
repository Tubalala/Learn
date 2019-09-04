package day.seven;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(321);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("cba");
        
        printArray(list);
        printArray(list1);
    }

    private static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();
    }
}
