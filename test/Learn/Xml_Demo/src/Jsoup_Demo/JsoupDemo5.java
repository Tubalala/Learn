package Jsoup_Demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsoupDemo5 {
    public static void main(String[] args) throws IOException {
        Document parse = Jsoup.parse(new File("D:\\代码\\idea java\\test\\Learn\\Xml_Demo\\src\\student.xml"), "utf-8");
        //XPath查询
        /*JXDocument jd = new JXDocument(parse);
        List<JXNode> jxNodes = jd.selN("//student");
        for (JXNode jxNode : jxNodes) {
            String textVal = jxNode.getTextVal();
            System.out.println(textVal);
        }*/
        JXDocument jd = JXDocument.create(parse);
        List<JXNode> jxNodes = jd.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);

        }

    }
}
