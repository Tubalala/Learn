package day.night;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"b","c","d","e","f","a");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("张三",20));
        list1.add(new Person("李四",18));
        list1.add(new Person("王五",12));
        list1.add(new Person("赵六",17));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
