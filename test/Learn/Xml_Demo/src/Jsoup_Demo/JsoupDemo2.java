package Jsoup_Demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //本地获取xml对象
        Document parse = Jsoup.parse(new File("D:\\代码\\idea java\\test\\Learn\\Xml_Demo\\src\\student.xml"), "utf-8");
//        System.out.println(parse);
        /*//获取网络对象
        URL url = new URL("https://www.baidu.com/?tn=98010089_dg&ch=7");
        Document parse1 = Jsoup.parse(url, 10000);*/

        Elements student = parse.getElementsByTag("student");
        System.out.println(student);
        System.out.println();

        Elements id = parse.getElementsByAttribute("id");
        System.out.println(id);
        System.out.println();
        Elements id1 = parse.getElementsByAttributeValue("id", "1");
        System.out.println(id1);
        System.out.println();
        Element elementById = parse.getElementById("1");
        System.out.println(elementById);
    }
}
