package day02.day10;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test01 {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"张三,男","二狗蛋,男","张三三三,男","张三一,女","张一,女"};
        ArrayList<String> list = filter(array,
                (String s) -> {
                    return s.split(",")[1].equals("男");
                },
                (String s) -> {
                    return s.split(",")[0].length() == 4;
                });
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
