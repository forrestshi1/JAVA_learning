package com.example.demo.Service;

import com.example.demo.pojo.User1;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface UserService1 {
    // 获取用户信息
    public User1 getUser(Long id);
    // 新增用户
    public int insertUser(User1 user) ;
}
