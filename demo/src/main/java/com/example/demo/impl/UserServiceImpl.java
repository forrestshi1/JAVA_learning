package com.example.demo.impl;

import com.example.demo.Service.UserService;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("检查用户参数是否为空......");
        }
        System.out.print("id =" + user.getId());
        System.out.print("\tusername =" + user.getName());
        System.out.println("\tnote =" + user.getNote());
    }
}