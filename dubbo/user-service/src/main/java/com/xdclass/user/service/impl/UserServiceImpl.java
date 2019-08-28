package com.xdclass.user.service.impl;

import com.xdclass.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:20 2019/8/28
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    public String sayHello(){
        return "Hello";
    }
}
