package day02.day07;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();

    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\代码\\idea java\\test\\Learn\\a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+" "+value);
        }
    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("张三","160");
        prop.setProperty("李四","165");
        prop.setProperty("王五","170");
        /*FileWriter fw = new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt");
        prop.store(fw,"save data");
        fw.close();*/
        prop.store(new FileWriter("D:\\代码\\idea java\\test\\Learn\\a.txt"),"");

    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("张三","160");
        prop.setProperty("李四","165");
        prop.setProperty("王五","170");
//        prop.put(11,true);
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+" "+value);
        }
    }
}
