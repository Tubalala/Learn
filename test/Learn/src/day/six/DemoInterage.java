package day.six;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoInterage {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    private static void demo3() {
        /*
        基本类型与字符串类型的相互转换
         */
        //基本类型 > 字符串
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1+200);
        String s2 = Integer.toString(i1);
        System.out.println(s2+200);
        String s3 = String.valueOf(i1);
        System.out.println(s3+200);

        //字符串 > 基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i-10);

    }

    private static void demo2() {
        Integer in = 1;
        in = in + 2;
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList集合无法直接存储整数，但可以存储Integer包装类
        list.add(1);//-->list.add(new Integer(1));自动装箱
        int a = list.get(0);//自动拆箱

    }

    private static void demo1() {
        Integer in1 = new Integer(1);
        System.out.println(in1);
        Integer in2 = new Integer("1");
        System.out.println(in2);

        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

    }
}
