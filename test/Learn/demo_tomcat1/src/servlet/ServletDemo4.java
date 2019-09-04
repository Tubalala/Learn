package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
@WebServlet("/demo4")
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求头数据
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            System.out.println(name+"----"+value);
        }
        /*String agent = req.getHeader("user-agent");
        //判断浏览器版本
        if (agent.contains("Firefox")) {
            System.out.println("火狐来了");
        } else if (agent.contains("IE")) {
            System.out.println("IE来了");
        }*/
        String referer = req.getHeader("referer");
        System.out.println(referer);
        //防盗链
        if (referer != null) {
            if (referer.contains("login")) {
                System.out.println("1111");
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("正常");
            }else{
                System.out.println("2222");
            }
        }
    }
}
