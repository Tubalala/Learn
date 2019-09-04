package day02.day03.test3;

import java.util.ArrayList;

/*
    Lambda表达式：是可推导，可省略书写的
    可以省略的内容：
        1.(参数列表):括号中参数列表的数据类型，可以省略不写
        2.(参数列表):括号中的参数如果只有一个，那么类型和（）都可以省略
        3.{一些代码}:如果｛｝中的代码只有一行，无论是否有返回值，都可以省略（｛｝，return，分号）
            注意：要省略｛｝，return，分号必须一起省略

     注意：
     使用Lambda必须有接口，且接口中只有一个抽象方法
     必须具有上下文推断
     有且只有一个抽象方法的接口 称之为函数式接口
 */
public class DemoArrayList {
    public static void main(String[] args) {
        //jdk 1.7前后泛型都要写
        ArrayList<String> list01 = new ArrayList<String>();
        //后面泛型可推导 就可以省略
        ArrayList<String> list02 = new ArrayList<>();
        //普通的创建方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建");
            }
        }).start();
        //Lambda简化后
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新线程创建");
        }).start();

        //优化省略Lambda
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"新线程创建！！！")).start();
    }
}
