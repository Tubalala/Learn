package day03.test01;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵明");
        list.add("张三");
        /*
        * 传统方法进行过滤
        * */
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }
        for (String s : list2) {
            System.out.println(s);
        }
        System.out.println("=============");
        /*
        * stream流进行过滤
        * jdk1.8才出现steam流
        * 关注做什么，而不是怎么做
        * */
        list.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));

    }
}
