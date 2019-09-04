package Jsoup_Demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
//        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document parse = Jsoup.parse(new File("D:\\代码\\idea java\\test\\Learn\\Xml_Demo\\src\\student.xml"), "utf-8");
        Elements name = parse.getElementsByTag("name");

        System.out.println(name.size());

        Element element = name.get(0);
        String text = element.text();
        System.out.println(text);
    }
}
