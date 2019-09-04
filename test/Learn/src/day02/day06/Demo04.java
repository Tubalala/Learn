package day02.day06;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\98461\\Desktop\\test\\aa.txt");
        /*int len = fis.read();
        System.out.println(len);

        len = fis.read();
        System.out.println(len);

        while ((len = fis.read()) != -1) {
            System.out.print((char)len);
        }*/
        //错误写法，必须有一个变量接收
        while (fis.read() != -1) {
            System.out.print((char)fis.read());
        }
        fis.close();
    }
}
