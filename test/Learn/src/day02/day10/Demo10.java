package day02.day10;

import java.util.function.Predicate;

/*
* Predicate<T>接口
* 作用对某种数据类型进行判断，结果返回boolean值
* 默认方法为test()
* */
public class Demo10 {
    public static boolean check(String name,Predicate<String> pre){
        return pre.test(name);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = check(s,(String str)->str.length()>5);
        System.out.println(b);
    }
}
