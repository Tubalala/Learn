package day02.day08;

import java.io.*;
import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(new Person("张三",18));
        arr.add(new Person("李四",19));
        arr.add(new Person("王五",17));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day08\\a.txt"));
        oos.writeObject(arr);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day08\\a.txt"));
        Object o = ois.readObject();

        ArrayList<Person> li = (ArrayList<Person>) o;
        System.out.println(li);

    }
}
