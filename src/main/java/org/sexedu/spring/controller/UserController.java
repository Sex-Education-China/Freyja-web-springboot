package org.sexedu.spring.controller;

import org.sexedu.spring.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {
    @Autowired
    MongoTemplate template;
    @ResponseBody
    @RequestMapping("/user")
    public String onCall() {
        User user = new User();
        user.setUsername("user1");
        user.setPassword("123456");
        user.setAdmin(false);
        user.setVip(false);
        user.setReg_ip("127.0.0.1");
        template.insert(user);
        return user.toString();
    }
}
