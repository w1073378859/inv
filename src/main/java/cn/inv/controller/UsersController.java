package cn.inv.controller;

import cn.inv.pojo.Users;
import cn.inv.service.UsersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Package: cn.inv.controller
 * @Description: 用户控制器
 * @Author Wh
 * @Create 2021年05月06日 11时42分42秒
 */
@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping("index")
    public String index(){

        return "index";
    }

    /**
     * @Author: W
     * @Date: 2021年05月126日 13时05分24秒
     * @Description: 登录
     * @param users
     * @return java.lang.String
     **/
    @PostMapping("doLogin")
    public String getUser(Users users, HttpSession session){

        boolean b = usersService.judgeUsers(users);
        if(b){
            Users user1 = usersService.getUser(users);
            session.setAttribute("USER",user1);
            System.out.println("登录成功！");

            return "redirect:/main";
        }
        return "index";
    }

    /**
     * @Author: W
     * @Date: 2021年05月126日 16时05分29秒
     * @Description: 主页

     * @return java.lang.String
     **/
    @RequestMapping("main")
    public String main(){
        return "main";
    }

    /**
     * @Author: W
     * @Date: 2021年05月126日 16时05分58秒
     * @Description: 欢迎页面

     * @return java.lang.String
     **/
    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }
}
