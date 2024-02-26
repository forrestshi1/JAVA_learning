package com.example.demo.dao;

import com.example.demo.pojo.User1;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User1 getUser(Long id);
    int insertUser(User1 user1);
}