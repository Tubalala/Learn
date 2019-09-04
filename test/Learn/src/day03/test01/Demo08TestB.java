package day03.test01;

import java.util.ArrayList;
import java.util.stream.Stream;
//使用stream流对传统方法进行优化
public class Demo08TestB {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("宋远桥");
        list.add("苏新河");
        list.add("石破天");
        list.add("石中玉");
        list.add("庄子");
        list.add("洪七公");

        Stream<String> one = list.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("古力娜扎");
        list1.add("张无忌");
        list1.add("赵丽颖");
        list1.add("张三丰");
        list1.add("尼古拉斯赵四");
        list1.add("张天爱");
        list1.add("张二狗");

        Stream<String> two = list1.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream<String> concat = Stream.concat(one, two);
        //调用map转化数据类型
        concat.map(name->new Demo08Person(name)).forEach(p-> System.out.println(p));
    }
}
