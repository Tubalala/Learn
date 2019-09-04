package day02.day04;

import java.io.File;

public class Demo06 {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        /*
        会遍历出路径
        * */
        File file = new File("C:\\Users\\98461\\Desktop\\test");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void show01() {
        /*
        遍历文件名
        能遍历出隐藏的文件夹
        * */
        File file = new File("C:\\Users\\98461\\Desktop\\test");
        String[] list = file.list();
        for (String fileName : list) {
            System.out.println(fileName);
        }
    }
}
