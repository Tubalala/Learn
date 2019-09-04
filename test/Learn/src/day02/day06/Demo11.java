package day02.day06;

import java.io.FileWriter;
import java.io.IOException;

public class Demo11 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt",true);
        for (int i = 0; i < 5; i++) {
            fw.write("hello world"+i+"\r\n");
        }
        fw.close();
    }
}
