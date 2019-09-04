package day.eight;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("ghi");
        set.add("def");
        System.out.println(set);//无序不允许重复
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("abc");
        set1.add("ghi");
        set1.add("def");
        System.out.println(set1);//有序不允许重复
    }
}
