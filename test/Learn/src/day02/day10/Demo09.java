package day02.day10;

import java.util.function.Consumer;
/*
* 分割字符串
* 使用andThen的方法
* */
public class Demo09 {
    public static void method(String[] arr,Consumer<String> con1,Consumer<String> con2){
        for (String message:arr){
            con1.andThen(con2).accept(message);
        }
    }
    public static void main(String[] args) {
        String[] array = {"张三,男","赵柳,女"};
        method(array,
                (s)->{
                    String name = s.split(",")[0];
                    System.out.print("姓名"+name);
                    },
                (s)->{
                    String male = s.split(",")[1];
                    System.out.println("性别"+male);
        });
    }
}
