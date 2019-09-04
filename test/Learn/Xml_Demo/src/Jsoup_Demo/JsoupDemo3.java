package Jsoup_Demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        Document parse = Jsoup.parse(new File("D:\\代码\\idea java\\test\\Learn\\Xml_Demo\\src\\student.xml"), "utf-8");
        //获取标签里的内容
        Elements name = parse.getElementsByTag("name");
        System.out.println(name.get(0).text());
        //不区分大小写
        Elements student = parse.getElementsByTag("student");
        String number = student.attr("number");
        System.out.println(number);

        String text = student.text();
        String html = student.html();
        System.out.println(text);
        System.out.println(html);
    }
}
