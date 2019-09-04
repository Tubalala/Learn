package day02.day03.tes2;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        //使用数组存储Person对象
        Person [] arrs ={
                new Person("张三",21),
                new Person("李四",20),
                new Person("王五",19),
                new Person("赵六",18)
        };

        Arrays.sort(arrs, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //使用Lamdba重写
        Arrays.sort(arrs,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        //优化省略后
        Arrays.sort(arrs,(Person o1, Person o2)->  o1.getAge() - o2.getAge());
        for (Person p :
                arrs) {
            System.out.println(p);
        }

    }
}
