package day02.day10;

import java.util.function.Predicate;

/*
* && 与
* || 或
* ！ 非
* */
public class Demo11 {
    public static boolean check(String str, Predicate<String> preA,Predicate<String> preB){
        return preA.test(str) || preB.test(str);
    }
    public static void main(String[] args) {
        String str = "abcdef";
        boolean b = check(str,
                (String s)->{
            return s.length()>5;
                },
                (String s)->{
            return s.contains("a");
                });
        System.out.println(b);
    }
}
