package com.example.demo.impl;

import com.example.demo.aspect.UserValidator;
import com.example.demo.pojo.User;

public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口:" + UserValidator.class.getSimpleName());
        return user != null;
    }
}