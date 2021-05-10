package cn.inv.service;

import cn.inv.pojo.Users;


/**
 * @Package: cn.inv.service
 * @Description: 用户
 * @Author Wh
 * @Create 2021年05月06日 11时42分02秒
 */
public interface UsersService {

    /**
     * @Author: W
     * @Date: 2021年05月126日 11时05分22秒
     * @Description: 判断用户密码是否相等
     * @param users
     * @return boolean
     **/
    boolean judgeUsers(Users users);

    /**
     * @Author: W
     * @Date: 2021年05月126日 16时05分58秒
     * @Description: 查询用户
     * @param users
     * @return cn.inv.pojo.Users
     **/
    Users getUser(Users users);
}
