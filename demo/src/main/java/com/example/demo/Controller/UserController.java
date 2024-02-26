package com.example.demo.Controller;


import com.example.demo.Service.UserService;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 定义控制器
@Controller // 通过该注解标识为控制器
@RequestMapping("/user") // 定义请求路径
public class UserController {
    // 注入用户服务
    @Autowired
    private UserService userService = null;
// 定义请求
@RequestMapping("/print")
// 转换为 JSON
@ResponseBody
// 定义类请求路径
public User printUser(Long id, String userName, String note) {
    User user = new User();
    user.setId(id);
    user.setName(userName);
    user.setNote(note);
    userService.printUser(user);// 若 user=null,则执行 afterthrowing 方法
    return user;// 加入断点
}
}