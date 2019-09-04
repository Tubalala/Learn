package cn.tu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class Filter3 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter3执行");
        chain.doFilter(req, resp);
        System.out.println("doFilter3回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
