package day02.day05;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\98461\\Desktop\\test");
        getAllFiles(file);
    }

    private static void getAllFiles(File f1) {
        System.out.println(f1);
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFiles(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
