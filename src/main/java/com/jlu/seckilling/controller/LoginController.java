package com.jlu.seckilling.controller;

import com.jlu.seckilling.result.Result;
import com.jlu.seckilling.service.UserService;
import com.jlu.seckilling.utils.redis.RedisService;
import com.jlu.seckilling.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author QuJing
 * @create 2020/3/2
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserService userService;

    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<Boolean> doLogin(@Valid LoginVo loginVo){
        System.out.println(loginVo);
        return null;
    }






}
