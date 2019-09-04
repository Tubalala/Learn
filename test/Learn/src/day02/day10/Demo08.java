package day02.day10;

import java.util.function.Consumer;

public class Demo08 {
    public static void get(String name,Consumer<String> con1,Consumer<String> con2){
        /*con1.accept(name);
        con2.accept(name);*/
        //使用andThen方法,先消费con1再消费con2
        con1.andThen(con2).accept(name);
    }
    public static void main(String[] args) {
        get("hello",
                (t)->{
                    System.out.println(t.toUpperCase());

            },
                (t)->{
                    System.out.println(t.toUpperCase());
        });



    }
}
