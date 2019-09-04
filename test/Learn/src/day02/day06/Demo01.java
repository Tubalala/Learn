package day02.day06;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01  {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\98461\\Desktop\\test\\aa.txt");
        fos.write(97);
        fos.close();
    }
}
