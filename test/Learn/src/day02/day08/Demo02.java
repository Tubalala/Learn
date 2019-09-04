package day02.day08;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day08\\a.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p);
    }
}
