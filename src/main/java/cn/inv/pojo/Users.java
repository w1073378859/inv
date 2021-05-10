package cn.inv.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**  
* @Package: cn.ins.pojo
* @Description: ${description}
* @Author Wh
* @Create 2021年04月06日 14时27分28秒
*/
@Data
@Setter
@Getter
public class Users {
    /**
    * 用户id
    */
    private Integer id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 真实姓名
    */
    private String realname;
}