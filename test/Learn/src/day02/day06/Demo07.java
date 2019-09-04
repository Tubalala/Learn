package day02.day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\代码\\idea java\\test\\Learn\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\代码\\idea java\\test\\Learn\\a.txt");
        file.createNewFile();
        fos.write("hello world".getBytes());
        fos.close();
    }
}

