package day02.day06;

import java.io.FileWriter;
import java.io.IOException;

/*jdk1.7新特性
    try的后边可以加一个（），在括号中可以选择定义流对象
    那么这个流对象的作用域在try中仍然有效
    不用再写finally释放对象
* */
public class Demo13 {
    public static void main(String[] args) throws IOException {
        try(
            FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt",true);
        ){
            for (int i = 0; i < 5; i++) {
                fw.write("hello world"+i+"\r\n");

            }
        }catch (IOException e){
            System.out.println(e);
        }
        /*jdk1.9的新特性
        try后边（）可以直接引用流对象名称（变量名）
        * */
        /*FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt",true);
        try(fw){
            for (int i = 0; i < 5; i++) {
                fw.write("hello world"+i+"\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }*/
    }
}
