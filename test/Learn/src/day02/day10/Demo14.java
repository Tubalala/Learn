package day02.day10;

import java.util.function.Function;
/*
* Function<T,R>用来转换数据类型，主要抽象方法为apply（T t）
* */
public class Demo14 {
    public static void main(String[] args) {
        String str = "123456";
        change(str,(String s)->Integer.parseInt(s));
    }

    private static void change(String s, Function<String,Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }
}
