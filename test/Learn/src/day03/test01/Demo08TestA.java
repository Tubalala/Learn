package day03.test01;

import java.util.ArrayList;

public class Demo08TestA {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("宋远桥");
        list.add("苏新河");
        list.add("石破天");
        list.add("石中玉");
        list.add("庄子");
        list.add("洪七公");
        ArrayList<String> one = new ArrayList<>();
        for (String s : list) {
            if (s.length()==3) {
                one.add(s);
            }
        }
        ArrayList<String> two = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            two.add(one.get(i));
        }

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("古力娜扎");
        list1.add("张无忌");
        list1.add("赵丽颖");
        list1.add("张三丰");
        list1.add("尼古拉斯赵四");
        list1.add("张天爱");
        list1.add("张二狗");
        ArrayList<String> three = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("张")) {
                three.add(s);
            }
        }
        ArrayList<String> four = new ArrayList<>();
        for (int i = 2; i < three.size(); i++) {
            four.add(three.get(i));
        }

        ArrayList<String> all = new ArrayList<>();
        all.addAll(two);
        all.addAll(four);

        ArrayList<Demo08Person> people = new ArrayList<>();
        for (String s : all) {
            people.add(new Demo08Person(s));
        }

        for (Demo08Person person : people) {
            System.out.println(person);
        }

    }
}
