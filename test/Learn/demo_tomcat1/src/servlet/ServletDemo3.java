package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;

@WebServlet("/Demo3")
//@WebServlet("*.do")//后缀名为do就可以访问
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println("doGET");
        //获取请求方式
        String method = req.getMethod();
        System.out.println(method);
        //获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //获取Servlet路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        //获取请求URI
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL.toString());
        //获取版本信息
        String protocol = req.getProtocol();
        System.out.println(protocol);
        //获取get方式请求参数
        String queryString = req.getQueryString();
        System.out.println(queryString);
        //获取主机地址
        String localAddr = req.getLocalAddr();
        System.out.println(localAddr);*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPOST");
    }
}
