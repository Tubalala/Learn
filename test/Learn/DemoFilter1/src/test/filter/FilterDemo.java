package test.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

@WebFilter("/*")
public class FilterDemo implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletRequest proxy_req = (ServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("getParameter")) {
                            String value = (String) method.invoke(req,args);
                            if (value != null) {
                                for (String str : list) {
                                    if (value.contains(str)) {
                                        value = value.replaceAll(str, "***");
                                    }
                                }
                            }
                            return value;
                        } else if (method.getName().equals("getParameterMap")) {
                            HashMap<String, String[]> map = new HashMap<>();
                            Map<String,String[]> values = (Map)method.invoke(req, args);
                            Set<Map.Entry<String, String[]>> entr = values.entrySet();
                            Iterator<Map.Entry<String, String[]>> iter = entr.iterator();
                            while (iter.hasNext()) {
                                Map.Entry<String, String[]> next = iter.next();
                                String key = next.getKey();
                                String[] value = next.getValue();
                                String[] w = new String[value.length];
                                for (int count = 0; count < value.length; count++) {
                                    for (String str : list) {
                                        if (value[count].contains(str)) {
                                            value[count] = value[count].replaceAll(str,"***");
                                        }
                                    }
                                    w[count] = value[count];
                                }
                                map.put(key,w);
                            }
                            return map;
                        } else {
                            return method.invoke(req, args);
                        }
                    }
                });
        chain.doFilter(proxy_req, resp);
    }
    //servletDemo?name=张三&msg=你是个笨蛋，你个傻瓜
    private List<String> list = new ArrayList<>();
    public void init(FilterConfig config) throws ServletException {

        String path = config.getServletContext().getRealPath("/WEB-INF/classes/敏感词汇");
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {

                list.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }

    public void destroy() {
    }

}
