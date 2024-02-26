package com.example.demo.aspect;

import com.example.demo.pojo.User;

public interface UserValidator {
    // 检测用户对象是否为空
    public boolean validate(User user);
}