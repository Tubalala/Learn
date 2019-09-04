package day02.day04;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    private static void show04() {
        //获取文件的大小
        File file = new File("C:\\Users\\98461\\Desktop\\aa.txt");
        System.out.println(file);
        long l = file.length();
        System.out.println(l);

        File file1 = new File("a.txt");
        System.out.println(file1.length());
        //文件夹没有大小
        File file2 = new File("C:\\Users\\98461\\Desktop");
        System.out.println(file2.length());
    }

    private static void show03() {
        //获取名称 路径结尾部分
        File file = new File("D:\\代码\\idea java\\test\\aa.txt");
        String name = file.getName();
        System.out.println(name);

        File file1 = new File("D:\\代码\\idea java\\test");
        System.out.println(file1.getName());
    }

    private static void show02() {
        //获取相对路径
        File file = new File("D:\\代码\\idea java\\test\\aa.txt");
        File file1 = new File("aa.txt");
        System.out.println(file.getPath());
        System.out.println(file1.getPath());

    }

    private static void show01() {
        //返回绝对路径
        File file = new File("D:\\代码\\idea java\\test\\aa.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        File file1 = new File("aa.txt");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);
    }
}
