package day.five.demo03;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        MyInterfaceimpl myInterfaceimpl = new MyInterfaceimpl();
        myInterfaceimpl.method();
        //匿名内部类，在创建对象时只能使用唯一一次
        //如果希望多次使用 就需要多次创建对象
        /*
        匿名对象调用方法只能使用一次
        匿名对象和匿名内部类不是一回事
         */
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现接口的方法！");
            }

            @Override
            public void method2() {
                System.out.println("111");
            }
        };
        obj.method();
        obj.method2();
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现接口的方法！");
            }

            @Override
            public void method2() {
                System.out.println("222");
            }
        }.method2();
        List<String> list = new ArrayList<>();
    }
}
