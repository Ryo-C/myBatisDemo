package com.ryo.mybatisdemo.springbootmybatis.service;

import com.ryo.mybatisdemo.springbootmybatis.mapper.UserMapper;
import com.ryo.mybatisdemo.springbootmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }

    public List<User> getAll() {
        return userMapper.getAll();
    }


}
