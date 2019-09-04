package day02.day07;

import java.io.*;
import java.util.HashMap;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt",true));
//        BufferedWriter bwClear = new BufferedWriter(new FileWriter("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day07\\a.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
//        bwClear.write("");
//        bwClear.close();
        br.close();
        bw.newLine();
        bw.write("===========================");
        bw.newLine();
        for (String key : map.keySet()) {
            line = key + "." + map.get(key);
            ((BufferedWriter) bw).write(line);
            ((BufferedWriter) bw).newLine();
        }

        bw.close();
    }
}
