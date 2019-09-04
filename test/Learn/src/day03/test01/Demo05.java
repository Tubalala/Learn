package day03.test01;

import java.util.ArrayList;
import java.util.stream.Stream;

/*count方法是终结方法
* 返回的是一个long类型的整数*/
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
