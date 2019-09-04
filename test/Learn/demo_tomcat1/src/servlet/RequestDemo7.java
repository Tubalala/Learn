package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Demo7")
public class RequestDemo7 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码（get在 Tomcat8.0已解决中文乱码问题）
        req.setCharacterEncoding("utf-8");
        req.setAttribute("msg","hello");
        req.getRequestDispatcher("/Demo8").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        请求转发：
        1.浏览器地址不会发生变化
        2.只能转发到当前服务器内部资源中
        3.转发是一次请求
         */
//        System.out.println("demo7");
//        req.getRequestDispatcher("/Demo8").forward(req,resp);

    }
}
