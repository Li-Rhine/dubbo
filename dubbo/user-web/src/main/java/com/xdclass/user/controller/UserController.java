package com.xdclass.user.controller;

import com.xdclass.user.service.UserService;
import org.apache.dubbo.config.annotation.Reference;

@RestController
public class UserController {

    @Reference(version = "1.0.0", url = "http://127.0.0.1:12345")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(){

    }
}
