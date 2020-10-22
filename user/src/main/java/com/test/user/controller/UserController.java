package com.test.user.controller;


import com.test.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserById")
    public String getUserById(@RequestParam(required = false)Integer userId){
        String userById = userService.getUserById();
        if (StringUtils.isEmpty(userById)){
            return "获取用户信息为空";
        }
        return userById;
    }
    @RequestMapping("getTrade")
    public String getTrade(){
        String tradeById = userService.getTrade();
        return tradeById;
    }
}
