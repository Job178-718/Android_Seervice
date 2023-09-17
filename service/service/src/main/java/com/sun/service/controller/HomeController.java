package com.sun.service.controller;

import com.sun.service.mapper.UserMapper;
import com.sun.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        // 在这里编写渲染主页的逻辑
        String content = "<h1>Welcome to the homepage!</h1>";
        return content;
    }

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username")String username,@RequestParam("password") String password) {
        System.out.println("============username="+username+" password="+password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if (Integer.valueOf(1).equals(userMapper.getUserById(user))) {
            return "success";
        }
        return "failed";
    }
}
