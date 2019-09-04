package day02.day08;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*printStream 打印流
能够方便打印各种数据

只负责输出，不负责读取
不会抛出IOException
print，println

可以使用System.setOut方法改变输出语句目的地，改为参数目的地
* */
public class Demo04 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\代码\\idea java\\test\\Learn\\src\\day02\\day08\\a.txt");
        ps.println("在打印流的目的地输出！\n");
        ps.write(97);
        ps.println(97);
        ps.println(9.7);
        ps.println("abc");
        ps.println(true);
        ps.close();
    }
}
