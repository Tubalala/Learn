package day02.day04;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
//        show01();
        show02();
    }
    /*
            public boolean isDirectory()判断是否为目录
            public boolean isFile()判断是否为文件
     */
    private static void show02() {
        File file = new File("C:\\Users\\98461\\Desktop\\aa.txt");
        if (file.exists()) {
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
        }
    }
/*
        public boolean exist()判断文件是否存在
 */
    private static void show01() {
        File file = new File("C:\\Users\\98461\\Desktop\\aa.txt");
        System.out.println(file.exists());

        File file1 = new File("C:\\Users\\98461\\Desktop");
        System.out.println(file1.exists());

        File file2 = new File("C:\\Users\\98461\\Deskto");
        System.out.println(file2.exists());

        File file3 = new File("aa.txt");
        System.out.println(file3.exists());
    }
}
