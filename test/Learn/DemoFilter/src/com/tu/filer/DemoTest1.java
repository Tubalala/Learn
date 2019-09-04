package com.tu.filer;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class DemoTest1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter...");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("doFilter回来了");
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");

    }
}
