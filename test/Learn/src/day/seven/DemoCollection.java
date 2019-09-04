package day.seven;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        ((ArrayList<String>) col).add("张三");
        ((ArrayList<String>) col).add("李四");
        ((ArrayList<String>) col).add("王五");
        ((ArrayList<String>) col).add("赵六");
        ((ArrayList<String>) col).add("田七");
        System.out.println(col);
        col.remove("张三");
        System.out.println(col);
        boolean b1 = col.contains("李四");
        System.out.println(b1);
        boolean b2 = col.isEmpty();
        System.out.println(b2);
        int b3 = col.size();
        System.out.println(b3);
        Object[] array = col.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
        col.clear();
        System.out.println(col);
    }
}
