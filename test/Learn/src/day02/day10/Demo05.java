package day02.day10;

import java.util.function.Supplier;
/*
* Supplier<T>接口被称之为生产接口，
*制定接口泛型是什么类型，那么接口中的get方法就会产生什么类型
* */
public class Demo05 {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            return "张三";
        });
        String s1 = getString(()->"李四");
        System.out.println(s+" "+s1);
    }
}
