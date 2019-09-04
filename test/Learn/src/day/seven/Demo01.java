package day.seven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Iterator的实现类对象
Collection中有一个iterator（）的方法
 */
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        ((ArrayList<String>) col).add("张三");
        ((ArrayList<String>) col).add("李四");
        ((ArrayList<String>) col).add("王五");
        ((ArrayList<String>) col).add("赵六");
        ((ArrayList<String>) col).add("田七");
        Iterator<String> it = col.iterator();

        boolean b1 = it.hasNext();//查看是否有元素
        System.out.println(b1);
        String s = it.next();//使用迭代器取出元素
        System.out.println(s);
        System.out.println(it);

        while (it.hasNext()){
            String s1 = it.next();
            System.out.print(s1+";");
        }

        for (Iterator<String> it1 = col.iterator();it1.hasNext();){
            String next = it1.next();
            System.out.print(next);
        }
        System.out.println();
        for (String st:col){
            System.out.print(st);
        }
        System.out.println();
        demo1();
    }

    private static void demo1() {
        //增强for循环
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        for (int i:a){
            System.out.print(i);
        }
        System.out.println();

    }
}
