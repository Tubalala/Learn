package day02.day06;

import java.io.FileWriter;
import java.io.IOException;
/*flush将数据刷新到内存，对象还可以继续使用
    close对象不可以使用
* */
public class Demo09 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt");
        fw.write(97);
        fw.flush();
        fw.write(98);
        fw.flush();
        fw.close();
    }
}
