package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    /**
     * 查找用户名
     * @param username
     * @return
     */
    public abstract User findByUsername(String username);

    /**
     * 保存用户
     * @param user
     */
    public abstract void save(User user);

    /**
     * 查询激活码
     * @param code
     * @return
     */
    public abstract User findByCode(String code);

    /**
     * 修改用户激活状态
     * @param user
     */
    public abstract void updateUserStatus(User user);

    /**
     * 查找用户名和密码
     * @param user
     * @return
     */
    public abstract User findUsernameAndPassword(String username,String password);
}
