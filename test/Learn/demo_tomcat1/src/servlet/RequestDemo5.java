package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo5")
public class RequestDemo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * 只有POST才有请求体
        * 获取请求体里的请求参数*/
        /*//获取字符流
        BufferedReader reader = req.getReader();
        //读取数据
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }*/
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数的通用方法
       /* //根据参数名称获取参数值
        String username = req.getParameter("username");
        System.out.println("get");
        System.out.println(username);*/
       this.doPost(req,resp);
       //根据参数名称获取参数值的数组
        String[] qws = req.getParameterValues("qw");
        for (String qw : qws) {
            System.out.println(qw);
        }
        //获取所有请求的参数名称
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String s = parameterNames.nextElement();
            System.out.println(s);
            String parameter = req.getParameter(s);
            System.out.print(""+parameter+"\n");
            System.out.println("==========");
        }
        System.out.println();
        //获取所有参数的MAP集合
        Map<String, String[]> map = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = map.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            for (String s : value) {
                System.out.println(key+"======"+s);
            }
            System.out.println("==========");
        }
    }
}
