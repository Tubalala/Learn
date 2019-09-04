package day02.day06;

import java.io.FileWriter;
import java.io.IOException;

/*在jdk1.7之前可以使用try catch处理流中的异常
* */
public class Demo12 {
    public static void main(String[] args) {
        FileWriter fw = null;//提高fw的作用域
        try{
            fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt",true);
            for (int i = 0; i < 5; i++) {
                fw.write("hello world"+i+"\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }finally {
            //一定会执行的代码
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
