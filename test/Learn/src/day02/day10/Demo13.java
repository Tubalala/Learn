package day02.day10;

import java.util.function.Predicate;

public class Demo13 {
    public static boolean check(String str, Predicate<String> pre){
//        return !pre.test(str);
        return pre.negate().test(str);
    }
    public static void main(String[] args) {
        String str = "abcdef";
        boolean b = check(str, (String s)->{
                    return s.length()>5;
                });
        System.out.println(b);
    }
}
