package Jsoup_Demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo4 {
    public static void main(String[] args) throws IOException {
        Document parse = Jsoup.parse(new File("D:\\代码\\idea java\\test\\Learn\\Xml_Demo\\src\\student.xml"), "utf-8");
        //标签选择器
        Elements name = parse.select("name");
        System.out.println(name);
        System.out.println("===========");

        Elements select = parse.select("#1");
        System.out.println(select);
        System.out.println("===========");
        //获取特定标签
        Elements student = parse.select("student[number='s002']");
        System.out.println(student);
        System.out.println("===========");
        //获取子标签
        Elements age = parse.select("student[number='s002']>age");
        System.out.println(age);
    }
}
