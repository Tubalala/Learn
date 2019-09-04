package day02.day10;

import java.util.function.Function;

public class Demo15 {
    public static void main(String[] args) {
        String s = "1000";
//        String s2 = change(s, (String s1) -> Integer.parseInt(s1), (Integer in) -> String.valueOf(in));
        String s2 = change(s, (String s1) -> Integer.parseInt(s1) + 10, (Integer in) -> in + "");
        System.out.println(s2);
    }

    private static String change(String s, Function<String,Integer> fc1,Function<Integer,String> fc2) {
       /* Integer in = fc1.apply(s);
        in = in + 10;
        String s1 = fc2.apply(in);
        return s1;*/
        String s1 = fc1.andThen(fc2).apply(s);
        return s1;
    }
}
