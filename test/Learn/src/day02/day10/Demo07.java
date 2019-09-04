package day02.day10;

/*
* Consumer接口中的包含抽象方法void accept（T t），
* 意为消费一个泛型数据
*
* 是一个消费型接口，泛型是什么，就消费什么类型数据
* 怎么消费需要自定义
* */

import java.util.function.Consumer;

public class Demo07 {
    public static void metod(String name, Consumer<String> con){
        con.accept(name);
    }
    public static void main(String[] args) {
        metod("张三",(String name)->{
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
