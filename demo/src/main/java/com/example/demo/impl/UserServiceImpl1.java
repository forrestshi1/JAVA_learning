package com.example.demo.impl;

import com.example.demo.Service.UserService1;
import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl1 implements UserService1 {


    @Autowired
    private UserDao userDao = null;
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED, timeout = 1)
    public int insertUser(User1 user) {
        return userDao.insertUser(user);
    }
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED, timeout = 1)
    public User1 getUser(Long id) {
        return userDao.getUser(id);
    }
}
