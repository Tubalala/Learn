package day02.day06;

import java.io.FileReader;
import java.io.IOException;

public class Demo08 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\代码\\idea java\\test\\Learn\\a.txt");
        int len = 0;
//        while ((len = fr.read()) != -1) {
//            System.out.print((char)len);
//        }
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
