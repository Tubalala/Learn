package day02.day05;

import java.io.File;
import java.io.FileFilter;

public class FilefilterImpl implements FileFilter {


    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}
