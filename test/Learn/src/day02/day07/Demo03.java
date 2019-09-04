package day02.day07;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        FileReader fr = new FileReader("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt");
        BufferedReader br = new BufferedReader(fr);
        for (int i = 0; i < 5; i++) {
            bw.write("你好！");
            bw.newLine();
        }
        bw.close();
        /*int len = 0;
        while ((len = br.read()) != -1) {
            System.out.println((char)len);
        }*/
        String len;
        while ((len = br.readLine()) != null) {
            System.out.print(len);
        }
        br.close();
    }
}
