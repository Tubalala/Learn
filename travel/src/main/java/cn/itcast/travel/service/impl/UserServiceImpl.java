package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    private UserDao dao = new UserDaoImpl();
    @Override
    public boolean regist(User user) {
        //根据用户名查对象
        User u = dao.findByUsername(user.getUsername());
        //判断是否存在
        if (u != null) {
            //存在注册失败
            return false;
        }
        //设置激活状态
        user.setStatus("N");
        //设置激活码，唯一字符串
        user.setCode(UuidUtil.getUuid());
        //保存用户
        dao.save(user);
       //激活邮件发送
        MailUtils.sendMail(user.getEmail(),"<a href='http://localhost:80/travel/user/active?code="+user.getCode()+"'>点击激活</a>","激活邮件");
        return true;
    }

    /**
     * 激活用户
     * @param code
     * @return
     */
    @Override
    public boolean active(String code) {
        User user = dao.findByCode(code);
        if (user != null) {
            dao.updateUserStatus(user);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public User login(User user) {
        User u = dao.findUsernameAndPassword(user.getUsername(),user.getPassword());
        return u;
    }


}
