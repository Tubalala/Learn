package cn.tu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//浏览器直接请求资源时会生效
//@WebFilter(value = "/index.jsp", dispatcherTypes = DispatcherType.REQUEST)
//@WebFilter(value = "/*", dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class Filter1 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter1...");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
