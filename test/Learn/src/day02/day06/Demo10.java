package day02.day06;

import java.io.FileWriter;
import java.io.IOException;

public class Demo10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt");
        char[] cs = {'a','b','c','d','e'};
        fw.write(cs);
        fw.write(cs,1,3);
        fw.write("你好");
        fw.write("黑马程序员",2,3);
        fw.close();
    }
}
