package com.xdclass.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 13:44 2019/8/29
 */
@SpringBootApplication
@ImportResource("consumer.xml")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }
}
