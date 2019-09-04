package day02.day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day08\\a.txt"));
        oos.writeObject(new Person("张三",21));
        oos.close();
    }
}
