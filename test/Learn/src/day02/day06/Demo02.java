package day02.day06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\98461\\Desktop\\test\\aa.txt"));
        //写100
        fos.write(49);
        fos.write(48);
        fos.write(48);
        //如果第一个字节是负数，那么第一个和二个字节就会组成一个中文字符
        byte[] btes = {-65,-66,-67,68,69};
        fos.write(btes);
        fos.write(btes,1,2);
        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();
    }
}
