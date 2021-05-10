package cn.inv.mapper;

import cn.inv.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Package: cn.inv.mapper
 * @Description: 用户
 * @Author Wh
 * @Create 2021年05月06日 11时32分07秒
 */
@Mapper
@Repository
public interface UsersMapper {

    /**
     * @Author: W
     * @Date: 2021年05月126日 11时05分18秒
     * @Description: 按照用户名查询用户
     * @param users
     * @return cn.inv.pojo.Users
     **/
    Users getUserByName(Users users);
}
