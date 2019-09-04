package day02.day06;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\98461\\Desktop\\test\\aa.txt");
        //起到缓冲作用
        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);//2
//        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));//ab

        len = fis.read(bytes);
        System.out.println(len);//1
        System.out.println(new String(bytes));//cb

        len = fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//cb*/
        byte[] bytes = new byte[1024];
        int len = 0;//记录每次读取的有效字节个数
        while ((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,len));
        }
        fis.close();
    }
}
