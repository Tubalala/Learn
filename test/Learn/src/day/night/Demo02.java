package day.night;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(115);
        list.add(11);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list);

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三",20));
        list1.add(new Student("李四",18));
        list1.add(new Student("王五",12));
        list1.add(new Student("赵六",17));
        list1.add(new Student("赵七",17));

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list1);

    }
}
