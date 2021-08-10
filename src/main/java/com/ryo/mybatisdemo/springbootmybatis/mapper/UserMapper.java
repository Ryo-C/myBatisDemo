package com.ryo.mybatisdemo.springbootmybatis.mapper;

import com.ryo.mybatisdemo.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    void insert(User user);

    List<User> getAll();

}
