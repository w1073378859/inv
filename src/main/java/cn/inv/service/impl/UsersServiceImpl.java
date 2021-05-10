package cn.inv.service.impl;

import cn.inv.mapper.UsersMapper;
import cn.inv.pojo.Users;
import cn.inv.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package: cn.inv.service.impl
 * @Description:
 * @Author Wh
 * @Create 2021年05月06日 11时44分59秒
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public boolean judgeUsers(Users users) {
        Users userByName = usersMapper.getUserByName(users);
        //判断用户是否存在
        if(userByName==null){

            return false;
        }
        //判断密码
        if((userByName.getPassword()).equals(users.getPassword())){
            userByName.setPassword("");
            return true;
        }
        return false;
    }

    @Override
    public Users getUser(Users users) {
        return usersMapper.getUserByName(users);
    }
}
