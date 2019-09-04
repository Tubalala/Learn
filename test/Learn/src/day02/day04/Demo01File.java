package day02.day04;

import java.io.File;

/*
    File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法
 */
public class Demo01File {
    public static void main(String[] args) {
        /*
        路径不能写死
        C:\develop\a\a.txt
        C:/develop/a/a.txt
        "C:"+File.pathSeparator+"develop"+File.pathSeparator+"a"+File.pathSeparator+"a.txt"
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符
    }
}
