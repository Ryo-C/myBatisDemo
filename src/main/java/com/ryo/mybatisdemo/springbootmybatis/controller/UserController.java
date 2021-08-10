package com.ryo.mybatisdemo.springbootmybatis.controller;

import com.ryo.mybatisdemo.springbootmybatis.model.User;
import com.ryo.mybatisdemo.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/insert")
    public List<User> insert() {
        User user = new User();
//        user.setId(1);
        user.setName("Ryo");
        user.setPosition("Trainee");
        userService.insert(user);
        return userService.getAll();
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
}
