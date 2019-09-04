package day02.day07;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        FileInputStream fis = new FileInputStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        bos.write("hallo world".getBytes());
//        bos.flush();
        bos.close();

        /*int len = 0;
        while ((len = bis.read())!=-1){
            System.out.print((char)len);
        }*/
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,len));
        }

        bis.close();
    }
}
