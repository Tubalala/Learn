package cn.itcast.travel.web.per;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取对象
        Map<String, String[]> map = request.getParameterMap();
        //封装对象
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        UserService service = new UserServiceImpl();
        User u = service.login(user);
        ResultInfo info = new ResultInfo();
        //验证码获取
        String check = request.getParameter("check");
        HttpSession session = request.getSession();
        String checkcode_server=(String) session.getAttribute("CHECKCODE_SERVER");
        //保证验证码只能使用一次
        request.removeAttribute("CHECKCODE_SERVER");
        if (checkcode_server.equalsIgnoreCase(check)) {
            //验证用户名密码
            if (u == null) {
                info.setFlag(false);
                info.setErrorMsg("用户名密码错误！");
            }

            if(u != null && !"Y".equals(u.getStatus())){
                //验证是否激活
                info.setFlag(false);
                info.setErrorMsg("用户未激活！");
            }
            if (u != null && "Y".equals(u.getStatus())) {
                //登录成功
                info.setFlag(true);
                //保存用户
                session.setAttribute("user",u);
            }
        }else {
            info.setFlag(false);
            info.setErrorMsg("验证码错误！");
        }

        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(response.getOutputStream(),info);
        String json = mapper.writeValueAsString(info);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
