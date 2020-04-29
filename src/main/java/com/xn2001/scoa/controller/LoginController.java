package com.xn2001.scoa.controller;

import com.xn2001.scoa.entity.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 乐心湖 on 2020/4/21 17:59
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录");
    }
}
