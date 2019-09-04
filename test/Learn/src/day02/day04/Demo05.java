package day02.day04;

import java.io.File;
import java.io.IOException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        /*
            true 文件删除成功
            false 文件夹有内容 不会删除 路径不存在
            不走回收站 直接删除
        */
        File file = new File("C:\\Users\\98461\\Desktop\\test\\1.txt");
        System.out.println(file.delete());
    }

    private static void show02() {
        /*
        单级创建文件夹 mkdir()
        既可以创建单级文件夹 也可以创建多级文件夹 mkdirs()
        路径不存在时不会抛出异常
        */
        File file = new File("C:\\Users\\98461\\Desktop\\test\\1");
        System.out.println(file.mkdir());
        File file1 = new File("C:\\Users\\98461\\Desktop\\test\\1\\2\\3");
        System.out.println(file1.mkdirs());

    }

    public static void show01() throws IOException {
        File file = new File("C:\\Users\\98461\\Desktop\\test\\1.txt");
        boolean newFile = file.createNewFile();
        /*
        文件不存在时 创建文件 返回 true
        存在时 返回 false
         */
        System.out.println(newFile);

        File file1 = new File("1.txt");
        System.out.println(file1.createNewFile());
    }
}
