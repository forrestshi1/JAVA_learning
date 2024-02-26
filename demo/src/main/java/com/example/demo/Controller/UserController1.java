package com.example.demo.Controller;
import com.example.demo.Service.UserService;

import com.example.demo.Service.UserService1;
import com.example.demo.pojo.User1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController1 {
    // 注入 Service
    @Autowired
    private UserService1 userService = null;
    // 测试获取用户
    @RequestMapping("/getUser")
    @ResponseBody
    public User1 getUser(Long id) {
        return userService.getUser(id);
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public Map<String, Object> insertUser(String userName, String note) {
        User1 user = new User1();
        user.setUserName(userName);
        user.setNote(note);
// 结果会回填主键,返回插入条数
        int update = userService.insertUser(user);
        Map<String, Object> result = new HashMap<>();
        result.put("success", update == 1);
        result.put("user", user);
        return result;
    }
}




