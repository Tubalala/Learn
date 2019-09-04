package day02.day04;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
//        show01();
//        show02("C:","aa.txt");
        show03();
    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"aa.txt");
        System.out.println(file);
    }

    /*
        File(String parent,String child)
        路径分成了两部分
        子路径和父路径
     */
    private static void show02(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);

    }

    private static void show01() {
        File file = new File("C:\\Users\\98461\\Desktop\\aa.txt");
        System.out.println(file);//重写了Object的toString的方法
        File file1 = new File("C:\\Users\\98461\\Desktop");
        System.out.println(file1);//
        File file2 = new File("aa.txt");
        System.out.println(file2);
    }
}
