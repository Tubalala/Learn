package day02.day06;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写
*/
public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\98461\\Desktop\\test\\aa.txt", true);
        fos.write("你好".getBytes());
        for (int i = 0; i < 5; i++) {
            fos.write("abc".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
