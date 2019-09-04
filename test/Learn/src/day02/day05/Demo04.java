package day02.day05;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo04 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\98461\\Desktop\\test");
        getAllFiles(file);
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().toLowerCase().endsWith(".txt");
//            }
//        });
//        file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name);
//            }
//        });
        File[] files = file.listFiles((File d, String name) -> {
            return new File(d,name).isDirectory() || name.toLowerCase().endsWith(".txt");
        });

    }

    private static void getAllFiles(File f1) {
//        System.out.println(f1);
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFiles(file);
            }else {
//                String s = file.toString();
//                if (s.endsWith(".txt")) {
//                    System.out.println(file);
//                }
//
                FilefilterImpl f = new FilefilterImpl();
                f.accept(file);
            }
        }
    }
}
