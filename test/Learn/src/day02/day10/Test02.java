package day02.day10;

import java.util.function.Function;

public class Test02 {

    public static void main(String[] args) {
        String s = "张三,20";
        int in = change(s, (String s1) -> s1.split(",")[1],
                (String s1) -> Integer.parseInt(s1),
                (Integer a) -> a + 100);
        System.out.println(in);
    }

    private static int change(String str, Function<String,String> fc1,Function<String,Integer> fc2,Function<Integer,Integer> fc3) {
        Integer in = fc1.andThen(fc2).andThen(fc3).apply(str);
        return in;
    }
}
