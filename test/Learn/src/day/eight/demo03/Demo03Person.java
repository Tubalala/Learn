package day.eight.demo03;

import java.util.HashSet;

public class Demo03Person {
    public static void main(String[] args) {
        //在类中重写hashCode后不会存储相同元素
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        Person p3 = new Person("张三", 19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
